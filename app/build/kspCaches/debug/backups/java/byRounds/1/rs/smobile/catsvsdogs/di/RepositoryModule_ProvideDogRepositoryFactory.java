package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.data.network.NetworkDataSource;
import rs.smobile.catsvsdogs.data.repository.ImageRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("rs.smobile.catsvsdogs.di.DogImageRepo")
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
public final class RepositoryModule_ProvideDogRepositoryFactory implements Factory<ImageRepository> {
  private final Provider<NetworkDataSource> networkDataSourceProvider;

  public RepositoryModule_ProvideDogRepositoryFactory(
      Provider<NetworkDataSource> networkDataSourceProvider) {
    this.networkDataSourceProvider = networkDataSourceProvider;
  }

  @Override
  public ImageRepository get() {
    return provideDogRepository(networkDataSourceProvider.get());
  }

  public static RepositoryModule_ProvideDogRepositoryFactory create(
      Provider<NetworkDataSource> networkDataSourceProvider) {
    return new RepositoryModule_ProvideDogRepositoryFactory(networkDataSourceProvider);
  }

  public static ImageRepository provideDogRepository(NetworkDataSource networkDataSource) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDogRepository(networkDataSource));
  }
}
