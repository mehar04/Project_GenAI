package rs.smobile.catsvsdogs;

import android.app.Activity;
import android.app.Service;
import android.content.res.AssetManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import rs.smobile.catsvsdogs.captioner.ImageCaptioner;
import rs.smobile.catsvsdogs.captioner.ImageCaptionerVocabulary;
import rs.smobile.catsvsdogs.classifier.ImageClassifier;
import rs.smobile.catsvsdogs.data.network.CatNetworkApi;
import rs.smobile.catsvsdogs.data.network.DogNetworkApi;
import rs.smobile.catsvsdogs.data.network.ImageNetworkDataSource;
import rs.smobile.catsvsdogs.data.repository.ImageRepository;
import rs.smobile.catsvsdogs.di.ImageCaptionerModule_ProvideImageCaptionerFactory;
import rs.smobile.catsvsdogs.di.ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory;
import rs.smobile.catsvsdogs.di.ImageClassifierModule_ProvideAssetManagerFactory;
import rs.smobile.catsvsdogs.di.ImageClassifierModule_ProvideImageClassifierFactory;
import rs.smobile.catsvsdogs.di.LlmModule_ProvideLargeLanguageModelFactory;
import rs.smobile.catsvsdogs.di.LlmModule_ProvideLlmDescriptorFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideCatBaseUrlFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideCatNetworkApiFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideCatRetrofitBuilderFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideDogBaseUrlFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideDogNetworkApiFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideDogRetrofitBuilderFactory;
import rs.smobile.catsvsdogs.di.NetworkModule_ProvideOkHttpClientFactory;
import rs.smobile.catsvsdogs.di.RepositoryModule_ProvideCatRepositoryFactory;
import rs.smobile.catsvsdogs.di.RepositoryModule_ProvideDogRepositoryFactory;
import rs.smobile.catsvsdogs.genai.LargeLanguageModel;
import rs.smobile.catsvsdogs.genai.LlmDescriptor;

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
public final class DaggerLiteRtApplication_HiltComponents_SingletonC {
  private DaggerLiteRtApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public LiteRtApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements LiteRtApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements LiteRtApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements LiteRtApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements LiteRtApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements LiteRtApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements LiteRtApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements LiteRtApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public LiteRtApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends LiteRtApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends LiteRtApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends LiteRtApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends LiteRtApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(ImmutableMap.<String, Boolean>of(MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, MainViewModel_HiltModules.KeyModule.provide()));
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }
  }

  private static final class ViewModelCImpl extends LiteRtApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<MainViewModel> mainViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(ImmutableMap.<String, javax.inject.Provider<ViewModel>>of(MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (mainViewModelProvider))));
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return ImmutableMap.<Class<?>, Object>of();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // rs.smobile.catsvsdogs.MainViewModel
          return (T) new MainViewModel(singletonCImpl.provideDogRepositoryProvider.get(), singletonCImpl.provideCatRepositoryProvider.get(), singletonCImpl.imageClassifier(), singletonCImpl.imageCaptioner(), singletonCImpl.provideLlmDescriptorProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends LiteRtApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends LiteRtApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends LiteRtApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<LargeLanguageModel> provideLargeLanguageModelProvider;

    Provider<OkHttpClient> provideOkHttpClientProvider;

    Provider<retrofit2.Retrofit.Builder> provideDogRetrofitBuilderProvider;

    Provider<DogNetworkApi> provideDogNetworkApiProvider;

    Provider<retrofit2.Retrofit.Builder> provideCatRetrofitBuilderProvider;

    Provider<CatNetworkApi> provideCatNetworkApiProvider;

    Provider<ImageNetworkDataSource> imageNetworkDataSourceProvider;

    Provider<ImageRepository> provideDogRepositoryProvider;

    Provider<ImageRepository> provideCatRepositoryProvider;

    Provider<LlmDescriptor> provideLlmDescriptorProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    AssetManager assetManager() {
      return ImageClassifierModule_ProvideAssetManagerFactory.provideAssetManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    ImageClassifier imageClassifier() {
      return ImageClassifierModule_ProvideImageClassifierFactory.provideImageClassifier(assetManager());
    }

    ImageCaptionerVocabulary imageCaptionerVocabulary() {
      return ImageCaptionerModule_ProvideImageCaptionerVocabularyFactory.provideImageCaptionerVocabulary(assetManager());
    }

    ImageCaptioner imageCaptioner() {
      return ImageCaptionerModule_ProvideImageCaptionerFactory.provideImageCaptioner(assetManager(), imageCaptionerVocabulary());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideLargeLanguageModelProvider = DoubleCheck.provider(new SwitchingProvider<LargeLanguageModel>(singletonCImpl, 0));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 5));
      this.provideDogRetrofitBuilderProvider = DoubleCheck.provider(new SwitchingProvider<retrofit2.Retrofit.Builder>(singletonCImpl, 4));
      this.provideDogNetworkApiProvider = DoubleCheck.provider(new SwitchingProvider<DogNetworkApi>(singletonCImpl, 3));
      this.provideCatRetrofitBuilderProvider = DoubleCheck.provider(new SwitchingProvider<retrofit2.Retrofit.Builder>(singletonCImpl, 7));
      this.provideCatNetworkApiProvider = DoubleCheck.provider(new SwitchingProvider<CatNetworkApi>(singletonCImpl, 6));
      this.imageNetworkDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<ImageNetworkDataSource>(singletonCImpl, 2));
      this.provideDogRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ImageRepository>(singletonCImpl, 1));
      this.provideCatRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ImageRepository>(singletonCImpl, 8));
      this.provideLlmDescriptorProvider = DoubleCheck.provider(new SwitchingProvider<LlmDescriptor>(singletonCImpl, 9));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectLiteRtApplication(LiteRtApplication arg0) {
      injectLiteRtApplication2(arg0);
    }

    @CanIgnoreReturnValue
    private LiteRtApplication injectLiteRtApplication2(LiteRtApplication instance) {
      LiteRtApplication_MembersInjector.injectLargeLanguageModel(instance, provideLargeLanguageModelProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // rs.smobile.catsvsdogs.genai.LargeLanguageModel
          return (T) LlmModule_ProvideLargeLanguageModelFactory.provideLargeLanguageModel();

          case 1: // @rs.smobile.catsvsdogs.di.DogImageRepo rs.smobile.catsvsdogs.data.repository.ImageRepository
          return (T) RepositoryModule_ProvideDogRepositoryFactory.provideDogRepository(singletonCImpl.imageNetworkDataSourceProvider.get());

          case 2: // rs.smobile.catsvsdogs.data.network.ImageNetworkDataSource
          return (T) new ImageNetworkDataSource(singletonCImpl.provideDogNetworkApiProvider.get(), singletonCImpl.provideCatNetworkApiProvider.get());

          case 3: // rs.smobile.catsvsdogs.data.network.DogNetworkApi
          return (T) NetworkModule_ProvideDogNetworkApiFactory.provideDogNetworkApi(singletonCImpl.provideDogRetrofitBuilderProvider.get());

          case 4: // @rs.smobile.catsvsdogs.di.DogApi retrofit2.Retrofit.Builder
          return (T) NetworkModule_ProvideDogRetrofitBuilderFactory.provideDogRetrofitBuilder(NetworkModule_ProvideDogBaseUrlFactory.provideDogBaseUrl(), singletonCImpl.provideOkHttpClientProvider.get());

          case 5: // okhttp3.OkHttpClient
          return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient();

          case 6: // rs.smobile.catsvsdogs.data.network.CatNetworkApi
          return (T) NetworkModule_ProvideCatNetworkApiFactory.provideCatNetworkApi(singletonCImpl.provideCatRetrofitBuilderProvider.get());

          case 7: // @rs.smobile.catsvsdogs.di.CatApi retrofit2.Retrofit.Builder
          return (T) NetworkModule_ProvideCatRetrofitBuilderFactory.provideCatRetrofitBuilder(NetworkModule_ProvideCatBaseUrlFactory.provideCatBaseUrl(), singletonCImpl.provideOkHttpClientProvider.get());

          case 8: // @rs.smobile.catsvsdogs.di.CatImageRepo rs.smobile.catsvsdogs.data.repository.ImageRepository
          return (T) RepositoryModule_ProvideCatRepositoryFactory.provideCatRepository(singletonCImpl.imageNetworkDataSourceProvider.get());

          case 9: // rs.smobile.catsvsdogs.genai.LlmDescriptor
          return (T) LlmModule_ProvideLlmDescriptorFactory.provideLlmDescriptor(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideLargeLanguageModelProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
