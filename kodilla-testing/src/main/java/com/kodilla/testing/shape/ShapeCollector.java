package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figury = new ArrayList<>();

    public void addFigure(Shape shape){
      figury.add(shape);
    }
    public void removeFigure(Shape shape){
     figury.remove(shape);
    }
    public Shape getFigure(int n){
        if(n>=0&&n<figury.size()){
            return figury.get(n);
        }

        return null;
    }
    public String showFigure(int n){
        if(n>=0&&n<figury.size()){
            return figury.get(n).getShapeName();
        }

        return "";
    }
}
