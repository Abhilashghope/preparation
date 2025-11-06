package DesignPatterns.Builder;


public class Vehicle {
   private String name;
   private int wheels;
   private String engine;
   private boolean airBags;
    private  Vehicle(VehicleBuilder builder) {
        this.name = builder.name;
        this.wheels = builder.wheels;
        this.engine = builder.engine;
        this.airBags = builder.airBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isAirBags() {
        return airBags;
    }

    public void setAirBags(boolean airBags) {
        this.airBags = airBags;
    }

    public static class VehicleBuilder{
        private String name;
        private int wheels;
        private String engine;
        private boolean airBags;
        public VehicleBuilder(String name, int wheels, String engine) {
            this.name = name;
            this.wheels = wheels;
            this.engine = engine;
        }

        public VehicleBuilder setAirBags(boolean airBags) {
            this.airBags = airBags;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
