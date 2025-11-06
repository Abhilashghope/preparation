package OOPs.Inheretance;

public class DeliveryMan extends User{
    public String deliveryVehicle;
    public DeliveryMan(int id, String name, int age, String deliveryVehicle) {
        super(id, name, age);
        this.deliveryVehicle = deliveryVehicle;
    }
    public void displayInfo (){
        super.displayInfo();
        System.out.println(deliveryVehicle);
    }

}

