package DesignPatterns.Signleton;

public final class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton() {
        System.out.println("EagerSingleton constructor called");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to singleton");
    }
}
