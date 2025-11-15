package rs.smobile.catsvsdogs.captioner;

import android.content.res.AssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class ImageCaptioner_Factory implements Factory<ImageCaptioner> {
  private final Provider<AssetManager> assetManagerProvider;

  private final Provider<String> modelPathProvider;

  private final Provider<String> lstmModelPathProvider;

  private final Provider<ImageCaptionerVocabulary> vocabularyProvider;

  private final Provider<Integer> inputSizeProvider;

  public ImageCaptioner_Factory(Provider<AssetManager> assetManagerProvider,
      Provider<String> modelPathProvider, Provider<String> lstmModelPathProvider,
      Provider<ImageCaptionerVocabulary> vocabularyProvider, Provider<Integer> inputSizeProvider) {
    this.assetManagerProvider = assetManagerProvider;
    this.modelPathProvider = modelPathProvider;
    this.lstmModelPathProvider = lstmModelPathProvider;
    this.vocabularyProvider = vocabularyProvider;
    this.inputSizeProvider = inputSizeProvider;
  }

  @Override
  public ImageCaptioner get() {
    return newInstance(assetManagerProvider.get(), modelPathProvider.get(), lstmModelPathProvider.get(), vocabularyProvider.get(), inputSizeProvider.get());
  }

  public static ImageCaptioner_Factory create(Provider<AssetManager> assetManagerProvider,
      Provider<String> modelPathProvider, Provider<String> lstmModelPathProvider,
      Provider<ImageCaptionerVocabulary> vocabularyProvider, Provider<Integer> inputSizeProvider) {
    return new ImageCaptioner_Factory(assetManagerProvider, modelPathProvider, lstmModelPathProvider, vocabularyProvider, inputSizeProvider);
  }

  public static ImageCaptioner newInstance(AssetManager assetManager, String modelPath,
      String lstmModelPath, ImageCaptionerVocabulary vocabulary, int inputSize) {
    return new ImageCaptioner(assetManager, modelPath, lstmModelPath, vocabulary, inputSize);
  }
}
