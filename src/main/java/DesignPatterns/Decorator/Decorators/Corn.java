package DesignPatterns.Decorator.Decorators;

import DesignPatterns.Decorator.Base.BasePizza;

public class Corn extends Toppings{
    BasePizza basePizza;
    public Corn(BasePizza basePizza) {
        this.basePizza = basePizza;

    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
