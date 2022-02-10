package com.company.Day1002;

public class Operators {
    public static void main(String[] args) {
       int x=3;
       int y=++x*5/x+++--x;
       y=4*5/4+4;
        System.out.println(x+" "+y);
        x=5;
        y=x=3;
        System.out.println(x+" "+y);
    }
}
