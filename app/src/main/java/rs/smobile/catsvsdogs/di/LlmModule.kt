package rs.smobile.catsvsdogs.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import rs.smobile.catsvsdogs.genai.LargeLanguageModel
import rs.smobile.catsvsdogs.genai.LargeLanguageModel.Gemma1bItCpu
import rs.smobile.catsvsdogs.genai.LlmDescriptor
import javax.inject.Singleton


//@Module
//@InstallIn(SingletonComponent::class)
//object LlmModule {
//
//    @Provides
//    fun provideLlmDescriptor(
//        @ApplicationContext context: Context,
//        largeLanguageModel: LargeLanguageModel,
//    ): LlmDescriptor = LlmDescriptor(context, largeLanguageModel)
//
//    @Provides
//    fun provideLargeLanguageModel(): LargeLanguageModel = Gemma1bItCpu
//
//}

// app/src/main/java/rs/smobile/catsvsdogs/di/LlmModule.kt
@Module
@InstallIn(SingletonComponent::class)
object LlmModule {

    @Provides
    @Singleton
    fun provideLargeLanguageModel(): LargeLanguageModel {
        return LargeLanguageModel.Gemma1bItCpu
    }

    @Provides
    @Singleton
    fun provideLlmDescriptor(
        @ApplicationContext context: Context,
        model: LargeLanguageModel
    ): LlmDescriptor = LlmDescriptor(context, model)
}
