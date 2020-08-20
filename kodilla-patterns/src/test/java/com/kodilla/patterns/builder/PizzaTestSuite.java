package com.kodilla.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew(){
        //Give
       Pizza pizza = new Pizza.PizzaBuilder()
               .ingredient("Onion")
               .bottom("Thiny")
               .sauce("Spicy")
               .ingredient("Ham")
               .ingredient("Chees")
               .build();

        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);
    }
}
