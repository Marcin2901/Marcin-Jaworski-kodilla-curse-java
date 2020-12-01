package com.kodilla.patterns2.decorator.pizza;

public class ExtraCheesDecorator extends AbstractPizzaOrderDecorator{

    public ExtraCheesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 8;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + extra chees";
    }
}
