package DesignPatterns.Factory;

public class Upi extends Payment {
    @Override
    public void processPayment() {
        System.out.println("UPI Payment");
    }
}
