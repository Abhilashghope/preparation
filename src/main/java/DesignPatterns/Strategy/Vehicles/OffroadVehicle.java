package DesignPatterns.Strategy.Vehicles;

import DesignPatterns.Strategy.DriveStrategy.SportyDrive;
import DesignPatterns.Strategy.GearStrategy.Manual;

public class OffroadVehicle extends Vehicle {


    public OffroadVehicle() {
        super(new SportyDrive(),new Manual());
    }
}
