package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
// 20.2
public class PizzaOrderTestSuite {
    @Test
    public void testPizzaExtraCheesCost() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheesDecorator(pizzaOrder);

        double theCost = pizzaOrder.getPrice();

        Assert.assertEquals( 23.0, theCost, 0);

    }

    @Test
    public void testPizzaExtraCheesDescription() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheesDecorator(pizzaOrder);

        String description = pizzaOrder.getIngredient();

        Assert.assertEquals("Pizza: sos tomato and chees + extra chees", description);
    }
    @Test
    public void testPizzaExtraCheesWithExtraIngredientCost() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheesDecorator(pizzaOrder);
        pizzaOrder = new ExtraIngredientDecorator(pizzaOrder);

        double theCost = pizzaOrder.getPrice();

        Assert.assertEquals( 28.0, theCost, 0);
    }
    @Test
    public void testPizzaExtraCheesWithExtraIngredientDescription() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheesDecorator(pizzaOrder);
        pizzaOrder = new ExtraIngredientDecorator(pizzaOrder);

        String description = pizzaOrder.getIngredient();

        Assert.assertEquals("Pizza: sos tomato and chees + extra chees + extra ingredient", description);
    }

}
