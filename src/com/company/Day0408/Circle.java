package com.company.Day0408;

public class Circle implements Shape{
    private int radius;

    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
