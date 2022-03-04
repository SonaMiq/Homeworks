package com.company.Day0408;

public class Square implements Shape{
    private int side;

    Square(int side){
        this.side=side;
    }
    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
}
