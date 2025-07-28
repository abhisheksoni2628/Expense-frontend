package com.abhishek.em.navigation.botttombar;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/abhishek/em/navigation/botttombar/BottomNavItem;", "", "route", "", "icon", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "getIcon", "()I", "getLabel", "Home", "Profile", "Settings", "Companion", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Home;", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Profile;", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Settings;", "app_debug"})
public abstract class BottomNavItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.abhishek.em.navigation.botttombar.BottomNavItem> items = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.abhishek.em.navigation.botttombar.BottomNavItem.Companion Companion = null;
    
    private BottomNavItem(java.lang.String route, @androidx.annotation.DrawableRes()
    int icon, java.lang.String label) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Companion;", "", "<init>", "()V", "items", "", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem;", "getItems", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.abhishek.em.navigation.botttombar.BottomNavItem> getItems() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Home;", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem;", "<init>", "()V", "app_debug"})
    public static final class Home extends com.abhishek.em.navigation.botttombar.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.abhishek.em.navigation.botttombar.BottomNavItem.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Profile;", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem;", "<init>", "()V", "app_debug"})
    public static final class Profile extends com.abhishek.em.navigation.botttombar.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.abhishek.em.navigation.botttombar.BottomNavItem.Profile INSTANCE = null;
        
        private Profile() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/abhishek/em/navigation/botttombar/BottomNavItem$Settings;", "Lcom/abhishek/em/navigation/botttombar/BottomNavItem;", "<init>", "()V", "app_debug"})
    public static final class Settings extends com.abhishek.em.navigation.botttombar.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.abhishek.em.navigation.botttombar.BottomNavItem.Settings INSTANCE = null;
        
        private Settings() {
        }
    }
}