package com.abhishek.em.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GreetUserUseCase_Factory implements Factory<GreetUserUseCase> {
  @Override
  public GreetUserUseCase get() {
    return newInstance();
  }

  public static GreetUserUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GreetUserUseCase newInstance() {
    return new GreetUserUseCase();
  }

  private static final class InstanceHolder {
    static final GreetUserUseCase_Factory INSTANCE = new GreetUserUseCase_Factory();
  }
}
