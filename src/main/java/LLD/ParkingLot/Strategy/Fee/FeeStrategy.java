package LLD.ParkingLot.Strategy.Fee;

import LLD.ParkingLot.Entity.ParkingTicket;

public abstract class FeeStrategy {
    public abstract double calculateFees(ParkingTicket parkingTicket);
}
