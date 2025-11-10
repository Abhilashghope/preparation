package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Burger.Burger;
import DesignPatterns.AbstractFactory.Factory.BurgerFactory;
import DesignPatterns.AbstractFactory.Factory.KingBurger;
import DesignPatterns.AbstractFactory.Factory.SinghBurger;
import DesignPatterns.AbstractFactory.GarlicBread.GarlicBread;
import DesignPatterns.AbstractFactory.GarlicBread.StandardGarlicBread;

public class MainClass {
    public static void main(String[] args) {
        BurgerFactory kingBurger = new KingBurger();
        BurgerFactory singhBurger = new SinghBurger();

        Burger standardSinghBurger = singhBurger.createBurger("standard");
        Burger normalSinghBurger = singhBurger.createBurger("normal");
        Burger PremiumSinghBurger = singhBurger.createBurger("premium");

        System.out.println(standardSinghBurger.prepare());
        System.out.println(normalSinghBurger.prepare());
        System.out.println(PremiumSinghBurger.prepare());

        Burger standardKingBurger = kingBurger.createBurger("standard");
        Burger normalKingBurger = kingBurger.createBurger("normal");
        Burger PremiumKingBurger = kingBurger.createBurger("premium");

        System.out.println(standardKingBurger.prepare());
        System.out.println(normalKingBurger.prepare());
        System.out.println(PremiumKingBurger.prepare());

        GarlicBread standardWheatGarlicBread = singhBurger.createGarlicBread("standard");
        GarlicBread NormalWheatGarlicBread = singhBurger.createGarlicBread("normal");
        GarlicBread premiumWheatGarlicBread = singhBurger.createGarlicBread("premium");

        System.out.println(standardWheatGarlicBread.prepare());
        System.out.println(NormalWheatGarlicBread.prepare());
        System.out.println(premiumWheatGarlicBread.prepare());

        GarlicBread standadGarlicBread = kingBurger.createGarlicBread("standard");
        GarlicBread normalGarlicBread = kingBurger.createGarlicBread("normal");
        GarlicBread premiumGarlicBread = kingBurger.createGarlicBread("premium");

        System.out.println(standadGarlicBread.prepare());
        System.out.println(normalGarlicBread.prepare());
        System.out.println(premiumGarlicBread.prepare());



    }
}
