package com.company.Day0702;

public class Person {
    String name;
    int age;
    String address;

    Person() {

    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.println(this.name + "  " + this.age + "  " + this.address);
    }
}
