package com.company.Day0408;

public class Rectangle implements Shape{
    private int side1;
    private int side2;

    Rectangle(int side1,int side2){
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public double perimeter() {
        return 2*(side1+side2);
    }
}
