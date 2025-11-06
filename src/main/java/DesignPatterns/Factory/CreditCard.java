package DesignPatterns.Factory;

public class CreditCard extends Payment {

    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment");
    }
}
