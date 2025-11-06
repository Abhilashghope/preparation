package DesignPatterns.Signleton;

public class DoubleCheckLockingSynchronizedSingleton {
    private static DoubleCheckLockingSynchronizedSingleton instance;

    private DoubleCheckLockingSynchronizedSingleton() {
        System.out.println("DoubleCheckLockingSynchronizedSingleton()");


    }

    public static DoubleCheckLockingSynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
