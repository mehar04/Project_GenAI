package rs.smobile.catsvsdogs.data.network;

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
public final class ImageNetworkDataSource_Factory implements Factory<ImageNetworkDataSource> {
  private final Provider<DogNetworkApi> dogNetworkApiProvider;

  private final Provider<CatNetworkApi> catNetworkApiProvider;

  public ImageNetworkDataSource_Factory(Provider<DogNetworkApi> dogNetworkApiProvider,
      Provider<CatNetworkApi> catNetworkApiProvider) {
    this.dogNetworkApiProvider = dogNetworkApiProvider;
    this.catNetworkApiProvider = catNetworkApiProvider;
  }

  @Override
  public ImageNetworkDataSource get() {
    return newInstance(dogNetworkApiProvider.get(), catNetworkApiProvider.get());
  }

  public static ImageNetworkDataSource_Factory create(Provider<DogNetworkApi> dogNetworkApiProvider,
      Provider<CatNetworkApi> catNetworkApiProvider) {
    return new ImageNetworkDataSource_Factory(dogNetworkApiProvider, catNetworkApiProvider);
  }

  public static ImageNetworkDataSource newInstance(DogNetworkApi dogNetworkApi,
      CatNetworkApi catNetworkApi) {
    return new ImageNetworkDataSource(dogNetworkApi, catNetworkApi);
  }
}
