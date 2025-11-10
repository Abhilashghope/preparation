package DesignPatterns.AbstractFactory.Burger;

public class NormalBurger extends Burger {
    @Override
    public String prepare() {
        return "preparing normal burger";
    }
}
