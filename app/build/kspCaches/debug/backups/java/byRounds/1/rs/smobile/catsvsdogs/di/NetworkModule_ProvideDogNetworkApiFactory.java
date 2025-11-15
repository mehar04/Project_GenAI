package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;
import rs.smobile.catsvsdogs.data.network.DogNetworkApi;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("rs.smobile.catsvsdogs.di.DogApi")
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
public final class NetworkModule_ProvideDogNetworkApiFactory implements Factory<DogNetworkApi> {
  private final Provider<Retrofit.Builder> builderProvider;

  public NetworkModule_ProvideDogNetworkApiFactory(Provider<Retrofit.Builder> builderProvider) {
    this.builderProvider = builderProvider;
  }

  @Override
  public DogNetworkApi get() {
    return provideDogNetworkApi(builderProvider.get());
  }

  public static NetworkModule_ProvideDogNetworkApiFactory create(
      Provider<Retrofit.Builder> builderProvider) {
    return new NetworkModule_ProvideDogNetworkApiFactory(builderProvider);
  }

  public static DogNetworkApi provideDogNetworkApi(Retrofit.Builder builder) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideDogNetworkApi(builder));
  }
}
