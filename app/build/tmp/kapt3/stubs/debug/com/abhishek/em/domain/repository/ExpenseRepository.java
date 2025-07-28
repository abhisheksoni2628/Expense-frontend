package com.abhishek.em.domain.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lcom/abhishek/em/domain/repository/ExpenseRepository;", "", "getExpenses", "Lkotlinx/coroutines/flow/Flow;", "Lcom/abhishek/em/utils/Network;", "", "Lcom/abhishek/em/data/local/Expense;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveExpense", "", "expense", "(Lcom/abhishek/em/data/local/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ExpenseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExpenses(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.abhishek.em.utils.Network<java.util.List<com.abhishek.em.data.local.Expense>>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveExpense(@org.jetbrains.annotations.NotNull()
    com.abhishek.em.data.local.Expense expense, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}