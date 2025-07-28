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
public final class FlowViewModel_Factory implements Factory<FlowViewModel> {
  private final Provider<ExpenseRepository> repositoryProvider;

  public FlowViewModel_Factory(Provider<ExpenseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FlowViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static FlowViewModel_Factory create(Provider<ExpenseRepository> repositoryProvider) {
    return new FlowViewModel_Factory(repositoryProvider);
  }

  public static FlowViewModel newInstance(ExpenseRepository repository) {
    return new FlowViewModel(repository);
  }
}
