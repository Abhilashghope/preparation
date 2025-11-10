package DesignPatterns.AbstractFactory.Burger;

public class PreminumBurger extends Burger {
    @Override
    public String prepare() {
        return "preparing Premium burger";
    }
}
