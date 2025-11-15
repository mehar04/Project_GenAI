package rs.smobile.catsvsdogs.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class NetworkModule_ProvideDogBaseUrlFactory implements Factory<String> {
  @Override
  public String get() {
    return provideDogBaseUrl();
  }

  public static NetworkModule_ProvideDogBaseUrlFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideDogBaseUrl() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideDogBaseUrl());
  }

  private static final class InstanceHolder {
    static final NetworkModule_ProvideDogBaseUrlFactory INSTANCE = new NetworkModule_ProvideDogBaseUrlFactory();
  }
}
