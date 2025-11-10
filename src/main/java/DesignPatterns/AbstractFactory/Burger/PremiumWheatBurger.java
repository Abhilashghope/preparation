package DesignPatterns.AbstractFactory.Burger;

public class PremiumWheatBurger extends Burger {
    @Override
    public String prepare() {
        return "preparing Premium Wheat burger";
    }
}
