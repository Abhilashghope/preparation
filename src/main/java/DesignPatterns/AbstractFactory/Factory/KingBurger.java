package DesignPatterns.AbstractFactory.Factory;

import DesignPatterns.AbstractFactory.Burger.Burger;
import DesignPatterns.AbstractFactory.Burger.NormalBurger;
import DesignPatterns.AbstractFactory.Burger.PreminumBurger;
import DesignPatterns.AbstractFactory.Burger.StandardBurger;
import DesignPatterns.AbstractFactory.GarlicBread.GarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.NormalGarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.PremiumGarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.StandardGarlicBread;

import java.util.Objects;

public class KingBurger extends BurgerFactory {

    @Override
    public Burger createBurger(String type) {
        if (Objects.equals(type, "standard")) {
            return new StandardBurger();
        } else if (Objects.equals(type, "normal")) {
            return new NormalBurger();
        }

        return new PreminumBurger();
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if (Objects.equals(type, "standard")) {
            return new StandardGarlicBread();
        } else if (Objects.equals(type, "normal")) {
            return new NormalGarlicBread();
        }

        return new PremiumGarlicBread();
    }
}
