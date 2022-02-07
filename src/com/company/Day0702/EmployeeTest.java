package com.company.Day0702;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(0, "Sona", "aaa", 25, "female");
        Employee employee2 = new Employee(1, "Anna", "aaa", 24, "female");
        Employee employee3 = new Employee(2, "Lilith", "bbb", 27, "female");
        Employee employee4 = new Employee(3, "Gevorg", "aaa", 22, "male");
        Employee employee5 = new Employee(4, "Arthur", "ccc", 28, "male");
        employee1.infoEmployee();
        employee2.infoEmployee();
        employee3.infoEmployee();
        employee4.infoEmployee();
        employee5.infoEmployee();
    }
}
