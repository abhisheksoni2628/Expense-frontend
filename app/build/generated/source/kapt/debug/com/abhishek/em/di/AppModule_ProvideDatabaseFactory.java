package com.abhishek.em.di;

import android.content.Context;
import com.abhishek.em.data.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDatabase(appContext));
  }
}
