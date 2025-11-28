package LLD.ParkingLot;

import LLD.ParkingLot.Entity.ParkingFloor;
import LLD.ParkingLot.Entity.ParkingSpot;
import LLD.ParkingLot.Entity.ParkingTicket;
import LLD.ParkingLot.Strategy.Fee.FeeStrategy;
import LLD.ParkingLot.Strategy.Fee.VehicleBasedFee;
import LLD.ParkingLot.Strategy.parking.NearestFitStrategy;
import LLD.ParkingLot.Strategy.parking.ParkingStrategy;
import LLD.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot INSTANCE;
    private final List<ParkingFloor> floors = new ArrayList<>();
    private final Map<String, ParkingTicket> activeTickets;
    private FeeStrategy feeStrategy;
    private ParkingStrategy parkingStrategy;

    private ParkingLot() {
        this.feeStrategy = new VehicleBasedFee();
        this.parkingStrategy = new NearestFitStrategy();
        this.activeTickets = new ConcurrentHashMap<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ParkingLot();
        }
        return INSTANCE;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public void removeFloor(ParkingFloor floor) {
        floors.remove(floor);
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public synchronized Optional<ParkingTicket> parkVehicle(Vehicle vehicle) {
        Optional<ParkingSpot> parkingSpot = parkingStrategy.findParkingSpot(floors, vehicle);
        if (parkingSpot.isPresent()) {
            ParkingSpot parkingSpot1 = parkingSpot.get();
            parkingSpot1.parkVehicle(vehicle);
            ParkingTicket parkingTicket = new ParkingTicket(vehicle, parkingSpot1);
            activeTickets.put(vehicle.getRegistrationNumber(), parkingTicket);
            System.out.printf("%s parked at %s with ticketId : %s\n", vehicle.getRegistrationNumber(),
                    parkingSpot1.getSpotId(), parkingTicket.getTicketId());
            return Optional.of(parkingTicket);
        }
        System.out.println("No parking Spot found for " + vehicle.getRegistrationNumber());
        return Optional.empty();
    }

    public synchronized Optional<Double> unparkVehicle(Vehicle vehicle) {
        ParkingTicket parkingTicket = activeTickets.remove(vehicle.getRegistrationNumber());
        if (parkingTicket == null) {
            System.out.println("No parking ticket found for " + vehicle.getRegistrationNumber());
            return Optional.empty();
        }
        parkingTicket.getSpot().unparkVehicle();
        double fees = feeStrategy.calculateFees(parkingTicket);
        return Optional.of(fees);
    }
}
