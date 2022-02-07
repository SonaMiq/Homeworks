package com.company.Day0702;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    String gender;

    Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void infoEmployee() {
        System.out.println(this.id + " " + this.name + " " + this.department + " " + this.age + " " + this.gender);
    }

}
