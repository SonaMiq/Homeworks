package com.company.Day0308;

public class Square extends Shape{
    @Override
    protected double getArea(double side) {
        return side*side;
    }

    @Override
    protected double getPerimeter(double side) {
        return 4*side;
    }
}
