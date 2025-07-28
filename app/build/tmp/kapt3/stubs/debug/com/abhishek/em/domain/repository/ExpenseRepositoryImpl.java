package com.abhishek.em.domain.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/abhishek/em/domain/repository/ExpenseRepositoryImpl;", "Lcom/abhishek/em/domain/repository/ExpenseRepository;", "dao", "Lcom/abhishek/em/data/local/ExpenseDao;", "<init>", "(Lcom/abhishek/em/data/local/ExpenseDao;)V", "getExpenses", "Lkotlinx/coroutines/flow/Flow;", "Lcom/abhishek/em/utils/Network;", "", "Lcom/abhishek/em/data/local/Expense;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveExpense", "", "expense", "(Lcom/abhishek/em/data/local/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExpenseRepositoryImpl implements com.abhishek.em.domain.repository.ExpenseRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.abhishek.em.data.local.ExpenseDao dao = null;
    
    @javax.inject.Inject()
    public ExpenseRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.ExpenseDao dao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getExpenses(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.abhishek.em.utils.Network<java.util.List<com.abhishek.em.data.local.Expense>>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveExpense(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.Expense expense, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}