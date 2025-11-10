package DesignPatterns.AbstractFactory.Burger;

public class StandardWheatBurger extends Burger {
    @Override
    public String prepare() {
        return "preparing Standard Wheat burger";
    }
}
