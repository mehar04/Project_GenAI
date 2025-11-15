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
public final class CatRepository_Factory implements Factory<CatRepository> {
  private final Provider<NetworkDataSource> networkDataSourceProvider;

  public CatRepository_Factory(Provider<NetworkDataSource> networkDataSourceProvider) {
    this.networkDataSourceProvider = networkDataSourceProvider;
  }

  @Override
  public CatRepository get() {
    return newInstance(networkDataSourceProvider.get());
  }

  public static CatRepository_Factory create(
      Provider<NetworkDataSource> networkDataSourceProvider) {
    return new CatRepository_Factory(networkDataSourceProvider);
  }

  public static CatRepository newInstance(NetworkDataSource networkDataSource) {
    return new CatRepository(networkDataSource);
  }
}
