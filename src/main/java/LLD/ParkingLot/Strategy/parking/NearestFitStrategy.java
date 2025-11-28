package LLD.ParkingLot.Strategy.parking;


import LLD.ParkingLot.Entity.ParkingFloor;
import LLD.ParkingLot.Entity.ParkingSpot;
import LLD.ParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class NearestFitStrategy extends ParkingStrategy{

    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingFloor> floorList, Vehicle vehicle) {

        for(ParkingFloor floor : floorList){
            Optional<ParkingSpot> spot = floor.getAvailableSpot(vehicle);
            if(spot.isPresent()){
                return spot;
            }
        }
        return Optional.empty();
    }
}
