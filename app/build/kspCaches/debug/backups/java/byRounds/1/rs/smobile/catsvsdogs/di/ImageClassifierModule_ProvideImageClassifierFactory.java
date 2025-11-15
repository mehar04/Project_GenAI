package rs.smobile.catsvsdogs.di;

import android.content.res.AssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.classifier.ImageClassifier;

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
public final class ImageClassifierModule_ProvideImageClassifierFactory implements Factory<ImageClassifier> {
  private final Provider<AssetManager> assetManagerProvider;

  public ImageClassifierModule_ProvideImageClassifierFactory(
      Provider<AssetManager> assetManagerProvider) {
    this.assetManagerProvider = assetManagerProvider;
  }

  @Override
  public ImageClassifier get() {
    return provideImageClassifier(assetManagerProvider.get());
  }

  public static ImageClassifierModule_ProvideImageClassifierFactory create(
      Provider<AssetManager> assetManagerProvider) {
    return new ImageClassifierModule_ProvideImageClassifierFactory(assetManagerProvider);
  }

  public static ImageClassifier provideImageClassifier(AssetManager assetManager) {
    return Preconditions.checkNotNullFromProvides(ImageClassifierModule.INSTANCE.provideImageClassifier(assetManager));
  }
}
