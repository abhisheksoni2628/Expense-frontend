package com.abhishek.em.data.local;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/abhishek/em/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "expenseDao", "Lcom/abhishek/em/data/local/ExpenseDao;", "app_debug"})
@androidx.room.Database(entities = {com.abhishek.em.data.local.Expense.class}, version = 1)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.abhishek.em.data.local.ExpenseDao expenseDao();
}