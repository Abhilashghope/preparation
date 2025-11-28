package LLD.ParkingLot.Strategy.Fee;

import LLD.ParkingLot.Entity.ParkingTicket;
import LLD.ParkingLot.Vehicle.VehicleType;

import java.util.Date;
import java.util.Map;

public class VehicleBasedFee extends FeeStrategy {
    public static final Map<VehicleType, Double> FEE_PER_HOUR = Map.of(VehicleType.TwoWheeler, 10.0,
            VehicleType.FourWheeler, 20.0, VehicleType.Truck, 40.0

    );

    @Override
    public double calculateFees(ParkingTicket parkingTicket) {
        Long exitTime = new Date().getTime();
        long duration = exitTime - parkingTicket.getEntryTime();
        long hours = duration / (60 * 60 * 1000) +1;
        return FEE_PER_HOUR.get(parkingTicket.getVehicle().getVehicleType()) * hours;
    }
}
