package DesignPatterns;

import DesignPatterns.Signleton.EagerSingleton;

public class DesignPatternsMain {
    public static void main(String[] args) {
        System.out.println("main");
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.connect();

    }
}
