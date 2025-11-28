package LLD.ParkingLot;

import LLD.ParkingLot.Entity.ParkingFloor;
import LLD.ParkingLot.Entity.ParkingSpot;
import LLD.ParkingLot.Entity.ParkingTicket;
import LLD.ParkingLot.Strategy.Fee.VehicleBasedFee;
import LLD.ParkingLot.Strategy.parking.NearestFitStrategy;
import LLD.ParkingLot.Vehicle.VehicleFactory;
import LLD.ParkingLot.Vehicle.VehicleType;
import LLD.ParkingLot.Vehicle.Vehicle;

import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        ParkingLot Itrend = ParkingLot.getInstance();

        ParkingFloor firstFloor = new ParkingFloor(1);
        ParkingSpot ps1 = new ParkingSpot("1", VehicleType.TwoWheeler);
        ParkingSpot ps2 = new ParkingSpot("2", VehicleType.TwoWheeler);
        ParkingSpot ps3 = new ParkingSpot("3", VehicleType.TwoWheeler);
        ParkingSpot ps4 = new ParkingSpot("4", VehicleType.FourWheeler);
        ParkingSpot ps5 = new ParkingSpot("5", VehicleType.FourWheeler);
        ParkingSpot ps6 = new ParkingSpot("6", VehicleType.FourWheeler);
        ParkingSpot ps7 = new ParkingSpot("7", VehicleType.FourWheeler);
    
        ParkingSpot ps10= new ParkingSpot("70", VehicleType.Truck);
        firstFloor.addSpot(ps1);
        firstFloor.addSpot(ps2);
        firstFloor.addSpot(ps3);
        firstFloor.addSpot(ps4);
        firstFloor.addSpot(ps5);
        firstFloor.addSpot(ps6);
        firstFloor.addSpot(ps7);
        firstFloor.addSpot(ps10);

        ParkingFloor floor2 = new ParkingFloor(2);
        floor2.addSpot(new ParkingSpot("F2-M1", VehicleType.FourWheeler));
        floor2.addSpot(new ParkingSpot("F2-M2", VehicleType.FourWheeler));

        Itrend.addFloor(floor2);
        Itrend.addFloor(firstFloor);

        Itrend.setParkingStrategy(new NearestFitStrategy());
        Itrend.setFeeStrategy(new VehicleBasedFee());



        firstFloor.findAllAvailableSpot();
        System.out.println();
        floor2.findAllAvailableSpot();
        System.out.println();

        Vehicle mh20 = VehicleFactory.getVehicleInstance(VehicleType.FourWheeler, "MH20DX5577");
        Vehicle bike = VehicleFactory.getVehicleInstance(VehicleType.TwoWheeler, "BIKE20DX5577");
        Vehicle truck =  VehicleFactory.getVehicleInstance(VehicleType.Truck, "TRUCK20DX5577");
        System.out.println();

        Optional<ParkingTicket> mh20Ticket = Itrend.parkVehicle(mh20);
        Optional<ParkingTicket> bikeTicket = Itrend.parkVehicle(bike);
        Optional<ParkingTicket> truckTicket = Itrend.parkVehicle(truck);
        System.out.println();
        firstFloor.findAllAvailableSpot();
        System.out.println();
        floor2.findAllAvailableSpot();

        Optional<Double> carFees = Itrend.unparkVehicle(mh20);
        System.out.println("CArFees: " + carFees);

        Vehicle newTruck =  VehicleFactory.getVehicleInstance(VehicleType.Truck, "TRUCK20DX5555");
        Optional<ParkingTicket> parkingTicket = Itrend.parkVehicle(newTruck);
    }
}
