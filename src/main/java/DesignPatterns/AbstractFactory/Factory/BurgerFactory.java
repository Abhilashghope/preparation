package DesignPatterns.AbstractFactory.Factory;

import DesignPatterns.AbstractFactory.Burger.Burger;
import DesignPatterns.AbstractFactory.GarlicBread.GarlicBread;

public abstract class BurgerFactory {
    public abstract Burger createBurger(String type);

    public abstract GarlicBread createGarlicBread(String type);


}
