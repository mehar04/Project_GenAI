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
public final class ImageCaptionerVocabulary_Factory implements Factory<ImageCaptionerVocabulary> {
  private final Provider<AssetManager> assetManagerProvider;

  private final Provider<String> vocabularyPathProvider;

  public ImageCaptionerVocabulary_Factory(Provider<AssetManager> assetManagerProvider,
      Provider<String> vocabularyPathProvider) {
    this.assetManagerProvider = assetManagerProvider;
    this.vocabularyPathProvider = vocabularyPathProvider;
  }

  @Override
  public ImageCaptionerVocabulary get() {
    return newInstance(assetManagerProvider.get(), vocabularyPathProvider.get());
  }

  public static ImageCaptionerVocabulary_Factory create(Provider<AssetManager> assetManagerProvider,
      Provider<String> vocabularyPathProvider) {
    return new ImageCaptionerVocabulary_Factory(assetManagerProvider, vocabularyPathProvider);
  }

  public static ImageCaptionerVocabulary newInstance(AssetManager assetManager,
      String vocabularyPath) {
    return new ImageCaptionerVocabulary(assetManager, vocabularyPath);
  }
}
