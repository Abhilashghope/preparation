package LLD.ParkingLot.Entity;

import LLD.ParkingLot.Vehicle.Vehicle;
import LLD.ParkingLot.Vehicle.VehicleType;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<String, ParkingSpot> spots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.spots = new ConcurrentHashMap<>();
    }

    public void addSpot(ParkingSpot spot) {
        this.spots.put(spot.getSpotId(), spot);
    }

    public synchronized Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle) {
        return spots.values().stream().filter(x -> x.isAvailable() && x.canFitVehicle(vehicle)).sorted(Comparator.comparing(ParkingSpot::getSpotType)).findFirst();
    }

    public void findAllAvailableSpot() {
        System.out.println("Finding all available parking spots for floor " + floorNumber);

        Map<VehicleType, Long> availSpotType =
                spots.values().stream().filter(ParkingSpot::isAvailable).collect(Collectors.groupingBy(ParkingSpot::getSpotType, Collectors.counting()));
        for (VehicleType type : VehicleType.values()) {
            System.out.println("Spot Type= " + type + ": Available Spots: " + availSpotType.getOrDefault(type, 0L));
        }
    }
}
