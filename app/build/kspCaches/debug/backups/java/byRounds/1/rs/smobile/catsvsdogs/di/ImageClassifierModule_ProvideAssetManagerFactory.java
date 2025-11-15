package rs.smobile.catsvsdogs.di;

import android.content.Context;
import android.content.res.AssetManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class ImageClassifierModule_ProvideAssetManagerFactory implements Factory<AssetManager> {
  private final Provider<Context> contextProvider;

  public ImageClassifierModule_ProvideAssetManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AssetManager get() {
    return provideAssetManager(contextProvider.get());
  }

  public static ImageClassifierModule_ProvideAssetManagerFactory create(
      Provider<Context> contextProvider) {
    return new ImageClassifierModule_ProvideAssetManagerFactory(contextProvider);
  }

  public static AssetManager provideAssetManager(Context context) {
    return Preconditions.checkNotNullFromProvides(ImageClassifierModule.INSTANCE.provideAssetManager(context));
  }
}
