package rs.smobile.catsvsdogs.genai

import android.content.Context
import android.util.Log
import com.google.common.util.concurrent.ListenableFuture
import com.google.common.util.concurrent.MoreExecutors
import com.google.common.util.concurrent.SettableFuture
import com.google.mediapipe.tasks.genai.llminference.LlmInference
import com.google.mediapipe.tasks.genai.llminference.LlmInferenceSession
import com.google.mediapipe.tasks.genai.llminference.LlmInferenceSession.LlmInferenceSessionOptions
import com.google.mediapipe.tasks.genai.llminference.ProgressListener
import java.io.File
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Robust LlmDescriptor:
 *  - creates/loads LlmInference off the main thread
 *  - enforces CPU backend to avoid NNAPI vendor delegate crashes
 *  - returns a ListenableFuture that will complete when the async generation finishes
 */
@Singleton
class LlmDescriptor @Inject constructor(
    private val context: Context,
    private val model: LargeLanguageModel,
) {

    private companion object {
        private const val MAX_TOKENS = 100
        private val TAG = LlmDescriptor::class.simpleName
    }

    // Single-thread executor for all heavy LLM init work (serialize initialization)
    private val initExecutor: ExecutorService = Executors.newSingleThreadExecutor()

    // Initialized lazily on background thread
    @Volatile
    private var llmInference: LlmInference? = null

    // Session may be recreated per-query
    @Volatile
    private var llmInferenceSession: LlmInferenceSession? = null

    /**
     * Generate a description for the given prompt.
     * - returns a ListenableFuture that completes with the final text (or fails on errors)
     * - progressListener will be used by the underlying MediaPipe API for streaming partials
     */
    fun generateLlmDescription(
        prompt: String,
        progressListener: ProgressListener<String>
    ): ListenableFuture<String> {
        val outerFuture = SettableFuture.create<String>()

        // Run initialization & session creation off the main thread
        initExecutor.execute {
            try {
                // Ensure model file exists (path() may copy asset to filesDir — keep that behavior)
                val modelPath = model.path(context)
                if (modelPath.isEmpty() || !File(modelPath).exists()) {
                    val msg = "LLM model file not found at: $modelPath"
                    Log.w(TAG, msg)
                    outerFuture.setException(IllegalStateException(msg))
                    return@execute
                }

                // Initialize engine if required (done only once)
                if (llmInference == null) {
                    try {
                        llmInference = createEngineBlocking(modelPath)
                        Log.i(TAG, "LlmInference engine initialized.")
                    } catch (t: Throwable) {
                        Log.e(TAG, "Failed to initialize LlmInference engine", t)
                        outerFuture.setException(t)
                        return@execute
                    }
                }

                // close previous session (if any) to release resources
                try {
                    llmInferenceSession?.close()
                } catch (t: Throwable) {
                    Log.w(TAG, "Failed to close previous LlmInferenceSession", t)
                }

                // create a new session
                val session = try {
                    createSessionBlocking()
                } catch (t: Throwable) {
                    Log.e(TAG, "Failed to create LlmInferenceSession", t)
                    outerFuture.setException(t)
                    return@execute
                }

                // Save the session reference
                llmInferenceSession = session

                // Add prompt and call the asynchronous generation method provided by MediaPipe
                session.addQueryChunk(prompt)

                // generateResponseAsync returns a ListenableFuture<String>
                val responseFuture: ListenableFuture<String> = try {
                    session.generateResponseAsync(progressListener)
                } catch (t: Throwable) {
                    Log.e(TAG, "generateResponseAsync threw", t)
                    outerFuture.setException(t)
                    return@execute
                }

                // Propagate result or failure from responseFuture to outerFuture
                responseFuture.addListener({
                    try {
                        // responseFuture.get() might throw; propagate result or exception
                        val result = responseFuture.get(5, TimeUnit.MINUTES)
                        outerFuture.set(result)
                    } catch (t: Throwable) {
                        outerFuture.setException(t)
                    }
                }, MoreExecutors.directExecutor())

            } catch (t: Throwable) {
                outerFuture.setException(t)
            }
        }

        return outerFuture
    }

    fun getModelName(): String = model.name

    private fun createSessionBlocking(): LlmInferenceSession {
        val engine = llmInference
            ?: throw IllegalStateException("LlmInference not initialized before creating session")

        return try {
            LlmInferenceSession.createFromOptions(engine, getSessionOptions())
        } catch (e: Exception) {
            Log.e(TAG, "LlmInferenceSession create error: ${e.message}", e)
            throw IllegalStateException("Failed to create model session", e)
        }
    }

    private fun getSessionOptions(): LlmInferenceSessionOptions =
        LlmInferenceSessionOptions.builder()
            .setTemperature(model.temperature)
            .setTopK(model.topK)
            .setTopP(model.topP)
            .build()

    private fun createEngineBlocking(modelPath: String): LlmInference {
        try {
            // enforce CPU backend for safety/compatibility
            val builder = LlmInference.LlmInferenceOptions.builder()
                .setModelPath(modelPath)
                .setMaxTokens(MAX_TOKENS)
                .setPreferredBackend(LlmInference.Backend.CPU) // force CPU to avoid NNAPI vendor delegates
            // build options and create engine
            val opts = builder.build()
            return LlmInference.createFromOptions(context, opts)
        } catch (e: Exception) {
            Log.e(TAG, "Load model error: ${e.message}", e)
            throw IllegalStateException("Failed to load model", e)
        }
    }

    /**
     * Close engine and session and shut down executor (call from Application.onTerminate or when app exits).
     */
    fun close() {
        try {
            llmInferenceSession?.close()
        } catch (ignored: Exception) { }
        llmInferenceSession = null

        try {
            llmInference?.close()
        } catch (ignored: Exception) { }
        llmInference = null

        try {
            initExecutor.shutdownNow()
        } catch (ignored: Exception) { }
    }
}
