package com.company.Day0702;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(0, "Sona","Mikayelyan", "aaa",25000, 25, "female");
        Employee employee2 = new Employee(1, "Anna", "Harutyunyan","aaa",12500, 24, "female");
        Employee employee3 = new Employee(2, "Lilith", "'Amiryan","bbb", 50000,27, "female");
        Employee employee4 = new Employee(3, "Gevorg","Adamyan", "aaa", 10000,22, "male");
        Employee employee5 = new Employee(4, "Arthur","Grigoryan", "ccc", 40000,28, "male");
        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();
    }
}
