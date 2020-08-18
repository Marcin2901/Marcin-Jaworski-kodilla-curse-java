package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resutl = calculator.add(2.0,3.0);
        //Then
        Assert.assertEquals(5.0,resutl ,0.001);
    }

    @Test
    public void testSubMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(6.5,2.2);
        //Then
        Assert.assertEquals(4.3,result,0.001);
    }

    @Test
    public void testMulMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(2.0,2.0);
        //Then
        Assert.assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testDivMethod() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result = calculator.div(6.0,2.0);
        //Then
        Assert.assertEquals(3.0,result,0.001);

    }
}
