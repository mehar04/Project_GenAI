package rs.smobile.catsvsdogs.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.data.network.NetworkDataSource;

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
public final class DogRepository_Factory implements Factory<DogRepository> {
  private final Provider<NetworkDataSource> networkDataSourceProvider;

  public DogRepository_Factory(Provider<NetworkDataSource> networkDataSourceProvider) {
    this.networkDataSourceProvider = networkDataSourceProvider;
  }

  @Override
  public DogRepository get() {
    return newInstance(networkDataSourceProvider.get());
  }

  public static DogRepository_Factory create(
      Provider<NetworkDataSource> networkDataSourceProvider) {
    return new DogRepository_Factory(networkDataSourceProvider);
  }

  public static DogRepository newInstance(NetworkDataSource networkDataSource) {
    return new DogRepository(networkDataSource);
  }
}
