package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double a,b,c,h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h=h;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (a*h)/2;
    }
}
