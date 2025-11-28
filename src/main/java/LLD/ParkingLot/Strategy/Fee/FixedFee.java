package LLD.ParkingLot.Strategy.Fee;

import LLD.ParkingLot.Entity.ParkingTicket;

import java.util.Date;

public class FixedFee extends FeeStrategy {

    public static final double HOuRLY_CHARGES = 10.0;

    @Override
    public double calculateFees(ParkingTicket parkingTicket) {
        Long ExitTime = new Date().getTime();
        long duration = ExitTime - parkingTicket.getEntryTime();
        long hours = duration / (60 * 60 * 1000) + 1;
        return HOuRLY_CHARGES * hours;
    }
}
