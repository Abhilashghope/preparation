package DesignPatterns.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("HOnda city",4,"125cc").setAirBags(true).build();
        Vehicle bike = new Vehicle.VehicleBuilder("pulsur",2,"125cc").setAirBags(false).build();
    }
}
