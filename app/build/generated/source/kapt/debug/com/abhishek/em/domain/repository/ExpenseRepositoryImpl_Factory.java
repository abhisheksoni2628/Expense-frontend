package com.abhishek.em.domain.repository;

import com.abhishek.em.data.local.ExpenseDao;
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
public final class ExpenseRepositoryImpl_Factory implements Factory<ExpenseRepositoryImpl> {
  private final Provider<ExpenseDao> daoProvider;

  public ExpenseRepositoryImpl_Factory(Provider<ExpenseDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public ExpenseRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static ExpenseRepositoryImpl_Factory create(Provider<ExpenseDao> daoProvider) {
    return new ExpenseRepositoryImpl_Factory(daoProvider);
  }

  public static ExpenseRepositoryImpl newInstance(ExpenseDao dao) {
    return new ExpenseRepositoryImpl(dao);
  }
}
