package OOPs.interfaces;

public class PharmacyOrder implements Orders{


    @Override
    public void createOrder() {
        System.out.println("Create Pharmacy Order");
    }

    @Override
    public void trackOrder() {
        System.out.println("Track Pharmacy Order");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancel Pharmacy Order");
    }
}
