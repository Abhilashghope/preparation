package DesignPatterns.Decorator;

import DesignPatterns.Decorator.Base.BasePizza;
import DesignPatterns.Decorator.Base.FarmHouse;
import DesignPatterns.Decorator.Base.Margarita;
import DesignPatterns.Decorator.Decorators.Cheese;
import DesignPatterns.Decorator.Decorators.Corn;
import DesignPatterns.Decorator.Decorators.Mushroom;

public class MainClass
{
    public static void main(String[] args)
    {
        //margarita 100
        //FarmHouse 120
        //cheese 20
        //mushroom 30
        //corn 50
        BasePizza cheeseFarmHouse = new Cheese(new FarmHouse());
        System.out.println(cheeseFarmHouse.cost());
        BasePizza mushroomMargarita = new Mushroom(new Margarita());
        System.out.println(mushroomMargarita.cost());
        BasePizza cheeseMushroomMargarita = new Cheese(mushroomMargarita);
        System.out.println("cheeseMushroomMargarita + cheese + Mushroom:"+cheeseMushroomMargarita.cost());

        BasePizza cornCheeseFarmHouse = new Corn(cheeseFarmHouse);
        System.out.println("corn + cheese + FarmHouse : "+cornCheeseFarmHouse.cost());
    }
}
