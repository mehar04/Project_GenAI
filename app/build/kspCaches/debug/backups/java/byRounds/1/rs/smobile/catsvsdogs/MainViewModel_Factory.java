package rs.smobile.catsvsdogs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import rs.smobile.catsvsdogs.captioner.ImageCaptioner;
import rs.smobile.catsvsdogs.classifier.ImageClassifier;
import rs.smobile.catsvsdogs.data.repository.ImageRepository;
import rs.smobile.catsvsdogs.genai.LlmDescriptor;

@ScopeMetadata
@QualifierMetadata({
    "rs.smobile.catsvsdogs.di.DogImageRepo",
    "rs.smobile.catsvsdogs.di.CatImageRepo"
})
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<ImageRepository> dogImageRepositoryProvider;

  private final Provider<ImageRepository> catImageRepositoryProvider;

  private final Provider<ImageClassifier> imageClassifierProvider;

  private final Provider<ImageCaptioner> imageCaptionerProvider;

  private final Provider<LlmDescriptor> llmInferenceModelProvider;

  public MainViewModel_Factory(Provider<ImageRepository> dogImageRepositoryProvider,
      Provider<ImageRepository> catImageRepositoryProvider,
      Provider<ImageClassifier> imageClassifierProvider,
      Provider<ImageCaptioner> imageCaptionerProvider,
      Provider<LlmDescriptor> llmInferenceModelProvider) {
    this.dogImageRepositoryProvider = dogImageRepositoryProvider;
    this.catImageRepositoryProvider = catImageRepositoryProvider;
    this.imageClassifierProvider = imageClassifierProvider;
    this.imageCaptionerProvider = imageCaptionerProvider;
    this.llmInferenceModelProvider = llmInferenceModelProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(dogImageRepositoryProvider.get(), catImageRepositoryProvider.get(), imageClassifierProvider.get(), imageCaptionerProvider.get(), llmInferenceModelProvider.get());
  }

  public static MainViewModel_Factory create(Provider<ImageRepository> dogImageRepositoryProvider,
      Provider<ImageRepository> catImageRepositoryProvider,
      Provider<ImageClassifier> imageClassifierProvider,
      Provider<ImageCaptioner> imageCaptionerProvider,
      Provider<LlmDescriptor> llmInferenceModelProvider) {
    return new MainViewModel_Factory(dogImageRepositoryProvider, catImageRepositoryProvider, imageClassifierProvider, imageCaptionerProvider, llmInferenceModelProvider);
  }

  public static MainViewModel newInstance(ImageRepository dogImageRepository,
      ImageRepository catImageRepository, ImageClassifier imageClassifier,
      ImageCaptioner imageCaptioner, LlmDescriptor llmInferenceModel) {
    return new MainViewModel(dogImageRepository, catImageRepository, imageClassifier, imageCaptioner, llmInferenceModel);
  }
}
