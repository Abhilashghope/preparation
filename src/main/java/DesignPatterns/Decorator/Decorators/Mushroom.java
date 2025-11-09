package DesignPatterns.Decorator.Decorators;

import DesignPatterns.Decorator.Base.BasePizza;

public class Mushroom extends Toppings {
    public BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+ 30;
    }
}
