package com.kodilla.spring;

//

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void contextLoads(){ }

    @Test
    public void testCircleLoadedIntoContainer(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape =context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is Circle", name);
    }

    @Test
    public void testTriangelLoadedIntoContainer(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean(Triangle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is Triangle", name);

    }

    @Test
    public void testSquareLoadedIntoContainer(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
       String name = shape.getShapeName();
        //Then
       Assert.assertEquals("This is Square", name);
    }

    @Test
    public void testShapeLoadedIntoContainer(){
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        System.out.println("Chosen shape is: " + name);
    }

}
