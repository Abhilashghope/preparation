package DesignPatterns.Signleton;

public final class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton instance;

    private LazySynchronizedSingleton() {
        System.out.println("LazySynchronizedSingleton constructor");
    }

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }

}
