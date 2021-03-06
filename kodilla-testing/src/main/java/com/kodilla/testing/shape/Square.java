package com.kodilla.testing.shape;

public class Square implements Shape {

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "SQUARE";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
