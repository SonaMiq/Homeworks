package com.company.Day0203.animal;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("Dog voice");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eat");
    }
}
