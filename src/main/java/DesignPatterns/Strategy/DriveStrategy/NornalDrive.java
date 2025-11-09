package DesignPatterns.Strategy.DriveStrategy;

public class NornalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
