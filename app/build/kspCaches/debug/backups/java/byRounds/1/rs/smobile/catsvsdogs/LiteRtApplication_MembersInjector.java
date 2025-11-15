package rs.smobile.catsvsdogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.genai.LargeLanguageModel;

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
public final class LiteRtApplication_MembersInjector implements MembersInjector<LiteRtApplication> {
  private final Provider<LargeLanguageModel> largeLanguageModelProvider;

  public LiteRtApplication_MembersInjector(
      Provider<LargeLanguageModel> largeLanguageModelProvider) {
    this.largeLanguageModelProvider = largeLanguageModelProvider;
  }

  public static MembersInjector<LiteRtApplication> create(
      Provider<LargeLanguageModel> largeLanguageModelProvider) {
    return new LiteRtApplication_MembersInjector(largeLanguageModelProvider);
  }

  @Override
  public void injectMembers(LiteRtApplication instance) {
    injectLargeLanguageModel(instance, largeLanguageModelProvider.get());
  }

  @InjectedFieldSignature("rs.smobile.catsvsdogs.LiteRtApplication.largeLanguageModel")
  public static void injectLargeLanguageModel(LiteRtApplication instance,
      LargeLanguageModel largeLanguageModel) {
    instance.largeLanguageModel = largeLanguageModel;
  }
}
