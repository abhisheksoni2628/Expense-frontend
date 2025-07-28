package com.abhishek.em.presentation.viewmodel;

import com.abhishek.em.domain.repository.ExpenseRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GreetingViewModel_Factory implements Factory<GreetingViewModel> {
  private final Provider<ExpenseRepository> repositoryProvider;

  public GreetingViewModel_Factory(Provider<ExpenseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GreetingViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static GreetingViewModel_Factory create(Provider<ExpenseRepository> repositoryProvider) {
    return new GreetingViewModel_Factory(repositoryProvider);
  }

  public static GreetingViewModel newInstance(ExpenseRepository repository) {
    return new GreetingViewModel(repository);
  }
}
