package rs.smobile.catsvsdogs.di;

import android.content.res.AssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.captioner.ImageCaptionerVocabulary;

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
public final class ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory implements Factory<ImageCaptionerVocabulary> {
  private final Provider<AssetManager> assetManagerProvider;

  public ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory(
      Provider<AssetManager> assetManagerProvider) {
    this.assetManagerProvider = assetManagerProvider;
  }

  @Override
  public ImageCaptionerVocabulary get() {
    return provideImageCaptionerVocabulary(assetManagerProvider.get());
  }

  public static ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory create(
      Provider<AssetManager> assetManagerProvider) {
    return new ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory(assetManagerProvider);
  }

  public static ImageCaptionerVocabulary provideImageCaptionerVocabulary(
      AssetManager assetManager) {
    return Preconditions.checkNotNullFromProvides(ImageCaptionerModule.INSTANCE.provideImageCaptionerVocabulary(assetManager));
  }
}
