package DesignPatterns.Strategy.Vehicles;

import DesignPatterns.Strategy.DriveStrategy.SportyDrive;
import DesignPatterns.Strategy.GearStrategy.Manual;

public class SportyVehicle extends Vehicle {

    public SportyVehicle() {
        super(new SportyDrive(),new Manual());
    }
}
