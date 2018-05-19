package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapeList = new ArrayList<>();

    public ArrayList<Shape> getList(){
        return shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public void removeFigure(Shape shape){
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
        }
    }
    public Shape getFigure(int n){
        return shapeList.get(n);
    }
    public String showFigures(){
        String result = "";
        for(Shape shape:shapeList){
            result = result + shape.getShapeName() + " ";
        }
        return result;
    }
}
