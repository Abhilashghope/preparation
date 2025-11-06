package OOPs.interfaces;

public class GroceryOrder implements Orders{

        @Override
        public void createOrder(){
            System.out.println("Create Grocery Order");
        }

        @Override
        public void trackOrder(){
            System.out.println("Track Grocery Order");
        }

        @Override
        public void cancelOrder(){
            System.out.println("Cancel Grocery Order");
        }

        public void printOrder(){
            System.out.println("Printing Grocery Order");
        }
    }


