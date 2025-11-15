package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;
import rs.smobile.catsvsdogs.data.network.CatNetworkApi;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("rs.smobile.catsvsdogs.di.CatApi")
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
public final class NetworkModule_ProvideCatNetworkApiFactory implements Factory<CatNetworkApi> {
  private final Provider<Retrofit.Builder> builderProvider;

  public NetworkModule_ProvideCatNetworkApiFactory(Provider<Retrofit.Builder> builderProvider) {
    this.builderProvider = builderProvider;
  }

  @Override
  public CatNetworkApi get() {
    return provideCatNetworkApi(builderProvider.get());
  }

  public static NetworkModule_ProvideCatNetworkApiFactory create(
      Provider<Retrofit.Builder> builderProvider) {
    return new NetworkModule_ProvideCatNetworkApiFactory(builderProvider);
  }

  public static CatNetworkApi provideCatNetworkApi(Retrofit.Builder builder) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCatNetworkApi(builder));
  }
}
