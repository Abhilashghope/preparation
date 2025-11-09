package DesignPatterns.Strategy;

import DesignPatterns.Strategy.Vehicles.OffroadVehicle;
import DesignPatterns.Strategy.Vehicles.PassengerVehicle;
import DesignPatterns.Strategy.Vehicles.SportyVehicle;

public class mainClass {

    public static void main(String[] args) {
        SportyVehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();
        sportyVehicle.gear();

        OffroadVehicle offroadVehicle = new OffroadVehicle();
        offroadVehicle.drive();
        offroadVehicle.gear();

        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
        passengerVehicle.gear();


    }
}
