package DesignPatterns.Strategy.Vehicles;

import DesignPatterns.Strategy.DriveStrategy.DriveStrategy;
import DesignPatterns.Strategy.GearStrategy.GearStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;
    public GearStrategy gearStrategy;


    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public Vehicle(GearStrategy gearStrategy){
        this.gearStrategy = gearStrategy;
    }
    public Vehicle(DriveStrategy driveStrategy, GearStrategy gearStrategy){
        this.driveStrategy = driveStrategy;
        this.gearStrategy = gearStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
    public void gear(){
        gearStrategy.gear();
    }

}
