package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public String getShapeName(){
        return "Square";
    }
    public double getField(){
        return side^2;
    }

}
