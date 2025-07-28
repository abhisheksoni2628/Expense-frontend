package com.abhishek.em.di;

import com.abhishek.em.data.remote.ApiService;
import com.abhishek.em.domain.repository.PostRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvidePostRepositoryFactory implements Factory<PostRepository> {
  private final Provider<ApiService> apiProvider;

  public AppModule_ProvidePostRepositoryFactory(Provider<ApiService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PostRepository get() {
    return providePostRepository(apiProvider.get());
  }

  public static AppModule_ProvidePostRepositoryFactory create(Provider<ApiService> apiProvider) {
    return new AppModule_ProvidePostRepositoryFactory(apiProvider);
  }

  public static PostRepository providePostRepository(ApiService api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePostRepository(api));
  }
}
