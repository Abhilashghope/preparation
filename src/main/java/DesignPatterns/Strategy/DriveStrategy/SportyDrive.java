package DesignPatterns.Strategy.DriveStrategy;

public class SportyDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sporty drive ");
    }
}
