package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.genai.LargeLanguageModel;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class LlmModule_ProvideLargeLanguageModelFactory implements Factory<LargeLanguageModel> {
  @Override
  public LargeLanguageModel get() {
    return provideLargeLanguageModel();
  }

  public static LlmModule_ProvideLargeLanguageModelFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LargeLanguageModel provideLargeLanguageModel() {
    return Preconditions.checkNotNullFromProvides(LlmModule.INSTANCE.provideLargeLanguageModel());
  }

  private static final class InstanceHolder {
    static final LlmModule_ProvideLargeLanguageModelFactory INSTANCE = new LlmModule_ProvideLargeLanguageModelFactory();
  }
}
