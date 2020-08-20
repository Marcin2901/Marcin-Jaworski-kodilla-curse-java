package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Give
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .sauce("barbecue")
                .ingredient("ser")
                .burgers(2)
                .ingredient("sałata")
                .ingredient("cebula")
                .build();

        System.out.println(bigmac);

        //When
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredient = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("with sesame", bun);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredient);
        Assert.assertEquals("barbecue", sauce);
    }
}
