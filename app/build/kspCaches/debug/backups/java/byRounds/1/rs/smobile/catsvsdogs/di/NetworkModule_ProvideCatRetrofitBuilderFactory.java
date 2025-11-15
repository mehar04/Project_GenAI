package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideCatRetrofitBuilderFactory implements Factory<Retrofit.Builder> {
  private final Provider<String> baseUrlProvider;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideCatRetrofitBuilderFactory(Provider<String> baseUrlProvider,
      Provider<OkHttpClient> clientProvider) {
    this.baseUrlProvider = baseUrlProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit.Builder get() {
    return provideCatRetrofitBuilder(baseUrlProvider.get(), clientProvider.get());
  }

  public static NetworkModule_ProvideCatRetrofitBuilderFactory create(
      Provider<String> baseUrlProvider, Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideCatRetrofitBuilderFactory(baseUrlProvider, clientProvider);
  }

  public static Retrofit.Builder provideCatRetrofitBuilder(String baseUrl, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCatRetrofitBuilder(baseUrl, client));
  }
}
