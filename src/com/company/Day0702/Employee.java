package com.company.Day0702;

public class Employee {
    int id;
    String name;
    String surname;
    String department;
    int salary;
    int age;
    String gender;

    Employee(int id, String name,String surname, String department, int salary,int age, String gender) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.department = department;
        this.salary=salary;
        this.age = age;
        this.gender = gender;
    }

    Employee(String name,String department){
        this(0,"Sona",null,"dfsdfsdf",0,0,"female");
    }

    public void printInfo() {
        System.out.printf(
                "ID: %d,Name: %s,Surname: %s,Department: %s,Salary: %d,Age: %d,String: %s",
                      this.id,this.name,this.surname,this.department,this.salary,this.age,this.gender);
    }

}
