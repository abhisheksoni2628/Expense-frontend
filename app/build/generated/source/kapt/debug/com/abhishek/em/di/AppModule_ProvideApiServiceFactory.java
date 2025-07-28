package com.abhishek.em.di;

import com.abhishek.em.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideApiServiceFactory implements Factory<ApiService> {
  @Override
  public ApiService get() {
    return provideApiService();
  }

  public static AppModule_ProvideApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService provideApiService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService());
  }

  private static final class InstanceHolder {
    static final AppModule_ProvideApiServiceFactory INSTANCE = new AppModule_ProvideApiServiceFactory();
  }
}
