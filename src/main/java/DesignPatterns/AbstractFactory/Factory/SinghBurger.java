package DesignPatterns.AbstractFactory.Factory;

import DesignPatterns.AbstractFactory.Burger.Burger;
import DesignPatterns.AbstractFactory.Burger.NormalWheatBurger;
import DesignPatterns.AbstractFactory.Burger.PremiumWheatBurger;
import DesignPatterns.AbstractFactory.Burger.StandardWheatBurger;
import DesignPatterns.AbstractFactory.GarlicBread.GarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.NormalWheatGarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.PremiumWheatGarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.StandardWheatGarlicBread;

public class SinghBurger extends BurgerFactory {
    @Override
    public Burger createBurger(String name) {
        if ("standard".equals(name)) {
            return new StandardWheatBurger();
        } else if ("normal".equals(name)) {
            return new NormalWheatBurger();
        }
        return new PremiumWheatBurger();
    }

    @Override
    public GarlicBread createGarlicBread(String name) {
        if ("standard".equals(name)) {
            return new StandardWheatGarlicBread();
        } else if ("normal".equals(name)) {
            return new NormalWheatGarlicBread();
        }
        return new PremiumWheatGarlicBread();
    }
}
