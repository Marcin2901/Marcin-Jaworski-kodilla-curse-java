package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle(){
        //Give
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The Circle", circle.getName());
    }
    @Test
    public void testFactorySquare() {
        //Give
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape("SQUARE");
        //Then
        Assert.assertEquals(Math.pow(7.0 , 2.0), square.getArea(),0);
        Assert.assertEquals("The Square", square.getName());
    }
    @Test
    public void testFactoryRactangle() {
        //Give
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("The Rectangle", rectangle.getName());
    }
}

