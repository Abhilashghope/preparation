package DesignPatterns.Decorator.Decorators;

import DesignPatterns.Decorator.Base.BasePizza;

public class Cheese extends Toppings {

    public BasePizza basePizza;
    public Cheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+ 20;
    }

}
