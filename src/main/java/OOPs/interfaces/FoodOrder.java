package OOPs.interfaces;

public class FoodOrder implements Orders {
    @Override
    public void createOrder(){
        System.out.println("Create Food Order");
    }

    @Override
    public void trackOrder(){
        System.out.println("Track Food Order");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Cancel Food Order");
    }
}
