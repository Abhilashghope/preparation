package DesignPatterns.Strategy.Vehicles;

import DesignPatterns.Strategy.DriveStrategy.NornalDrive;
import DesignPatterns.Strategy.GearStrategy.Automatic;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NornalDrive(),new Automatic());
    }
}
