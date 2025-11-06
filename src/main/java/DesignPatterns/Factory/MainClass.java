package DesignPatterns.Factory;

public class MainClass {
    public static void main(String[] args) {
        Payment p1 = Factory.getInstance("CreditCard");
        Payment p2 = Factory.getInstance("Upi");
        p1.processPayment();
        p2.processPayment();
    }
}
