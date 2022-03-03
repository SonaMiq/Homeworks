package com.company.Day0308;

public class Circle  extends Shape{
    @Override
    protected double getArea(double radius) {
        return Math.PI*radius*radius;
    }

    @Override
    protected double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
}
