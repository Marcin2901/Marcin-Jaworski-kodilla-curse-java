package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Before
    public void beforeTest(){
        System.out.println("Test begin");
    }
    @After
    public void afterTest(){
        System.out.println("Test ended");
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);

        shapeCollector.addFigure(square);

        Assert.assertEquals(square, shapeCollector.figury.get(0));

    }
    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        Square square = new Square(4);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);


        shapeCollector.removeFigure(circle);


        Assert.assertNotEquals(circle, shapeCollector.figury.get(0));

    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);

        Shape shape= null;
        shapeCollector.addFigure(square);
        shape=shapeCollector.getFigure(0);

        Assert.assertEquals(square, shape);

    }
    @Test
    public void testShowFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);


        shapeCollector.addFigure(square);


        Assert.assertEquals(square.getShapeName(), shapeCollector.showFigure(0));

    }



}
