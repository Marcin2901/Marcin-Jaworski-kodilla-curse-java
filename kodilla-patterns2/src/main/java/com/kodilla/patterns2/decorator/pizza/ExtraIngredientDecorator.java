package com.kodilla.patterns2.decorator.pizza;

public class ExtraIngredientDecorator  extends AbstractPizzaOrderDecorator{
    public ExtraIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + extra ingredient";
    }
}
