package DesignPatterns.Factory;

public class Factory {

    public static Payment getInstance(String type) {
        return switch (type) {
            case "CreditCard" -> new CreditCard();
            case "Upi" -> new Upi();
            default -> null;
        };
    }
}
