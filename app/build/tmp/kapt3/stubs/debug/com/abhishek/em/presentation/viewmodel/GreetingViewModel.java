package com.abhishek.em.presentation.viewmodel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/abhishek/em/presentation/viewmodel/GreetingViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/abhishek/em/domain/repository/ExpenseRepository;", "<init>", "(Lcom/abhishek/em/domain/repository/ExpenseRepository;)V", "_greeting", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "greeting", "Lkotlinx/coroutines/flow/StateFlow;", "getGreeting", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "", "Lcom/abhishek/em/data/local/Expense;", "expenses", "getExpenses", "()Ljava/util/List;", "setExpenses", "(Ljava/util/List;)V", "expenses$delegate", "Landroidx/compose/runtime/MutableState;", "_counterFlow", "", "sharedCounter", "getSharedCounter", "startCounter", "", "saveExpense", "expense", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class GreetingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.abhishek.em.domain.repository.ExpenseRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _greeting = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> greeting = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState expenses$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _counterFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> sharedCounter = null;
    
    @javax.inject.Inject()
    public GreetingViewModel(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.domain.repository.ExpenseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getGreeting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.abhishek.em.data.local.Expense> getExpenses() {
        return null;
    }
    
    private final void setExpenses(java.util.List<com.abhishek.em.data.local.Expense> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSharedCounter() {
        return null;
    }
    
    private final void startCounter() {
    }
    
    public final void saveExpense(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.Expense expense) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getExpenses() {
        return null;
    }
}