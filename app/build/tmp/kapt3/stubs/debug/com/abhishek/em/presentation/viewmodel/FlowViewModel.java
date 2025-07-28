package com.abhishek.em.presentation.viewmodel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/abhishek/em/presentation/viewmodel/FlowViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/abhishek/em/domain/repository/ExpenseRepository;", "<init>", "(Lcom/abhishek/em/domain/repository/ExpenseRepository;)V", "numbersFlow", "Lkotlinx/coroutines/flow/Flow;", "", "sharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSharedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "coldFlow", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FlowViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.abhishek.em.domain.repository.ExpenseRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Integer> sharedFlow = null;
    
    @javax.inject.Inject()
    public FlowViewModel(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.domain.repository.ExpenseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> numbersFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Integer> getSharedFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> coldFlow() {
        return null;
    }
}