package rs.smobile.catsvsdogs.classifier;

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
public final class ImageClassifier_Factory implements Factory<ImageClassifier> {
  private final Provider<AssetManager> assetManagerProvider;

  private final Provider<String> modelPathProvider;

  private final Provider<String> labelPathProvider;

  private final Provider<Integer> inputSizeProvider;

  public ImageClassifier_Factory(Provider<AssetManager> assetManagerProvider,
      Provider<String> modelPathProvider, Provider<String> labelPathProvider,
      Provider<Integer> inputSizeProvider) {
    this.assetManagerProvider = assetManagerProvider;
    this.modelPathProvider = modelPathProvider;
    this.labelPathProvider = labelPathProvider;
    this.inputSizeProvider = inputSizeProvider;
  }

  @Override
  public ImageClassifier get() {
    return newInstance(assetManagerProvider.get(), modelPathProvider.get(), labelPathProvider.get(), inputSizeProvider.get());
  }

  public static ImageClassifier_Factory create(Provider<AssetManager> assetManagerProvider,
      Provider<String> modelPathProvider, Provider<String> labelPathProvider,
      Provider<Integer> inputSizeProvider) {
    return new ImageClassifier_Factory(assetManagerProvider, modelPathProvider, labelPathProvider, inputSizeProvider);
  }

  public static ImageClassifier newInstance(AssetManager assetManager, String modelPath,
      String labelPath, int inputSize) {
    return new ImageClassifier(assetManager, modelPath, labelPath, inputSize);
  }
}
