package com.kodilla.patterns2.decorator.pizza;

public class AbstractPizzaOrderDecorator implements PizzaOrder{
    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public double getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getIngredient() {
        return pizzaOrder.getIngredient();
    }
}
