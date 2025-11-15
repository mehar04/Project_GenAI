package rs.smobile.catsvsdogs.di;

import android.content.res.AssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.captioner.ImageCaptioner;
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
public final class ImageCaptionerModule_ProvideImageCaptionerFactory implements Factory<ImageCaptioner> {
  private final Provider<AssetManager> assetManagerProvider;

  private final Provider<ImageCaptionerVocabulary> imageCaptionerVocabularyProvider;

  public ImageCaptionerModule_ProvideImageCaptionerFactory(
      Provider<AssetManager> assetManagerProvider,
      Provider<ImageCaptionerVocabulary> imageCaptionerVocabularyProvider) {
    this.assetManagerProvider = assetManagerProvider;
    this.imageCaptionerVocabularyProvider = imageCaptionerVocabularyProvider;
  }

  @Override
  public ImageCaptioner get() {
    return provideImageCaptioner(assetManagerProvider.get(), imageCaptionerVocabularyProvider.get());
  }

  public static ImageCaptionerModule_ProvideImageCaptionerFactory create(
      Provider<AssetManager> assetManagerProvider,
      Provider<ImageCaptionerVocabulary> imageCaptionerVocabularyProvider) {
    return new ImageCaptionerModule_ProvideImageCaptionerFactory(assetManagerProvider, imageCaptionerVocabularyProvider);
  }

  public static ImageCaptioner provideImageCaptioner(AssetManager assetManager,
      ImageCaptionerVocabulary imageCaptionerVocabulary) {
    return Preconditions.checkNotNullFromProvides(ImageCaptionerModule.INSTANCE.provideImageCaptioner(assetManager, imageCaptionerVocabulary));
  }
}
