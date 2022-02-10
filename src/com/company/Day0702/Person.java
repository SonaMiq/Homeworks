package com.company.Day0702;

public class Person {
    static int count=0;
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        count++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.printf(
                "Name: %s, Age: %d, Address: %s",this.name,this.age,this.address);
    }
}

