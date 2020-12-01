package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements PizzaOrder{

    @Override
    public double getPrice() {
        return 15;
    }

    @Override
    public String getIngredient() {
        return "Pizza: sos tomato and chees";
    }
}
