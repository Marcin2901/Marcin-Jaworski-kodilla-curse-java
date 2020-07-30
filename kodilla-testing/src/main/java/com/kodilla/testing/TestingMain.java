package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = calculator.add(2, 4);
        if (a == 6)
            System.out.println("test.1 -> true");
        else
            System.out.println("test.1 -> error");
        int b = calculator.subtrack(5, 2);
        if (b == 3)
            System.out.println("test.2 -> true");
        else
            System.out.println("test.2 -> error");
    }
}
