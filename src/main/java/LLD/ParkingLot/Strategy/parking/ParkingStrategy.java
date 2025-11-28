package LLD.ParkingLot.Strategy.parking;

import LLD.ParkingLot.Entity.ParkingFloor;
import LLD.ParkingLot.Entity.ParkingSpot;
import LLD.ParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public abstract class ParkingStrategy {
    public abstract Optional<ParkingSpot> findParkingSpot(List<ParkingFloor> floorList, Vehicle vehicle);
}
