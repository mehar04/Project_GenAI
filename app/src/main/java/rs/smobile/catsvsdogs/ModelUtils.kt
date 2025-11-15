package rs.smobile.catsvsdogs

import android.content.res.AssetManager
import java.io.File
import java.io.FileInputStream
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

/**
 * Load a model file into a MappedByteBuffer suitable for TensorFlow Lite Interpreter.
 *
 * If [modelPath] is an absolute path to a file on device, it maps that file.
 * Otherwise it treats [modelPath] as an asset name and opens it via AssetManager.
 *
 * Usage:
 *   val buffer = assetManager.loadModelFile("my_model.tflite")
 *   val interpreter = Interpreter(buffer, options)
 */
@Throws(Exception::class)
fun AssetManager.loadModelFile(modelPath: String): MappedByteBuffer {
    // If modelPath is an absolute file path on device (e.g. /data/... or /sdcard/..)
    val file = File(modelPath)
    if (file.exists()) {
        FileInputStream(file).use { fis ->
            val channel: FileChannel = fis.channel
            return channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size())
        }
    }

    // Otherwise treat as asset name and open from APK assets
    val afd = openFd(modelPath)
    FileInputStream(afd.fileDescriptor).use { inputStream ->
        val channel: FileChannel = inputStream.channel
        return channel.map(FileChannel.MapMode.READ_ONLY, afd.startOffset, afd.declaredLength)
    }
}
