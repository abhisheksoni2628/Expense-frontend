package com.abhishek.em.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/abhishek/em/di/AppModule;", "", "<init>", "()V", "provideApiService", "Lcom/abhishek/em/data/remote/ApiService;", "provideDatabase", "Lcom/abhishek/em/data/local/AppDatabase;", "appContext", "Landroid/content/Context;", "provideExpenseDao", "Lcom/abhishek/em/data/local/ExpenseDao;", "db", "providePostRepository", "Lcom/abhishek/em/domain/repository/PostRepository;", "api", "provideExpenseRepository", "Lcom/abhishek/em/domain/repository/ExpenseRepository;", "expenseDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.abhishek.em.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.abhishek.em.data.remote.ApiService provideApiService() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.abhishek.em.data.local.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.abhishek.em.data.local.ExpenseDao provideExpenseDao(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.abhishek.em.domain.repository.PostRepository providePostRepository(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.remote.ApiService api) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.abhishek.em.domain.repository.ExpenseRepository provideExpenseRepository(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.ExpenseDao expenseDao) {
        return null;
    }
}