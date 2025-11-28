package LLD.ParkingLot.Entity;

import LLD.ParkingLot.Vehicle.Vehicle;
import LLD.ParkingLot.Vehicle.VehicleType;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final long entryTime;
    private final ParkingSpot spot;

    public ParkingTicket( Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = new Date().getTime();
    }

    public String getTicketId() {
        return ticketId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Long getEntryTime() {
        return entryTime;
    }
    public ParkingSpot getSpot() {
        return spot;
    }
}
