package rs.smobile.catsvsdogs.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.genai.LargeLanguageModel;
import rs.smobile.catsvsdogs.genai.LlmDescriptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class LlmModule_ProvideLlmDescriptorFactory implements Factory<LlmDescriptor> {
  private final Provider<Context> contextProvider;

  private final Provider<LargeLanguageModel> modelProvider;

  public LlmModule_ProvideLlmDescriptorFactory(Provider<Context> contextProvider,
      Provider<LargeLanguageModel> modelProvider) {
    this.contextProvider = contextProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public LlmDescriptor get() {
    return provideLlmDescriptor(contextProvider.get(), modelProvider.get());
  }

  public static LlmModule_ProvideLlmDescriptorFactory create(Provider<Context> contextProvider,
      Provider<LargeLanguageModel> modelProvider) {
    return new LlmModule_ProvideLlmDescriptorFactory(contextProvider, modelProvider);
  }

  public static LlmDescriptor provideLlmDescriptor(Context context, LargeLanguageModel model) {
    return Preconditions.checkNotNullFromProvides(LlmModule.INSTANCE.provideLlmDescriptor(context, model));
  }
}
