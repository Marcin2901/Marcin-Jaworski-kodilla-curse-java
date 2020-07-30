package com.kodilla.testing.shape;

public class Circle implements Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "CIRCLE";
    }

    @Override
    public double getField() {
        return 3.14*this.r*this.r;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
