package LLD.ParkingLot.Strategy.parking;

import LLD.ParkingLot.Entity.ParkingFloor;
import LLD.ParkingLot.Entity.ParkingSpot;
import LLD.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FarthestFirstStrategy extends ParkingStrategy{

    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingFloor> floorList, Vehicle vehicle) {
        List<ParkingFloor> floors = new ArrayList<>(floorList);
        Collections.reverse(floors);
        for(ParkingFloor floor : floors){
            Optional<ParkingSpot> spot = floor.getAvailableSpot(vehicle);
            if(spot.isPresent()){
                return spot;
            }
        }
        return Optional.empty();
    }
}
