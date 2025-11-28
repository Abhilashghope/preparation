package LLD.ParkingLot.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicleInstance(VehicleType type, String registrationNumber) {
        Vehicle vehicle = null;
        return switch (type) {
            case TwoWheeler -> new TwoWheeler(registrationNumber);
            case FourWheeler -> new FourWheeler(registrationNumber);
            case Truck -> new Truck(registrationNumber);
            default -> null;
        };
    }
}
