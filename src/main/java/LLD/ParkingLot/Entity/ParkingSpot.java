package LLD.ParkingLot.Entity;

import LLD.ParkingLot.Vehicle.Vehicle;
import LLD.ParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    private final String spotId;
    private final VehicleType spotType;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(String spotId, VehicleType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isEmpty = true;
        this.vehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public boolean isAvailable() {
        return isEmpty;
    }

    public boolean isOccupied() {
        return !isEmpty;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public synchronized void unparkVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        if (this.isOccupied()) {
            return false;
        }
        return switch (vehicle.getVehicleType()) {
            case TwoWheeler -> this.spotType == VehicleType.TwoWheeler;
            case FourWheeler -> this.spotType == VehicleType.FourWheeler;
            case Truck -> this.spotType == VehicleType.Truck;
            default -> false;
        };
    }
}
