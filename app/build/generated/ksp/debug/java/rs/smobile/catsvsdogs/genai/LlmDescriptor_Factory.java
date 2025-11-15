package rs.smobile.catsvsdogs.genai;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LlmDescriptor_Factory implements Factory<LlmDescriptor> {
  private final Provider<Context> contextProvider;

  private final Provider<LargeLanguageModel> modelProvider;

  public LlmDescriptor_Factory(Provider<Context> contextProvider,
      Provider<LargeLanguageModel> modelProvider) {
    this.contextProvider = contextProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public LlmDescriptor get() {
    return newInstance(contextProvider.get(), modelProvider.get());
  }

  public static LlmDescriptor_Factory create(Provider<Context> contextProvider,
      Provider<LargeLanguageModel> modelProvider) {
    return new LlmDescriptor_Factory(contextProvider, modelProvider);
  }

  public static LlmDescriptor newInstance(Context context, LargeLanguageModel model) {
    return new LlmDescriptor(context, model);
  }
}
