package com.company.Day2802;

public class Homework2802 {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setFirstName("Sona");
        person1.setLastName("Mikayelyan");
        person1.setAge(34);
        person1.setPassportId("AN050201");
        person1.setGender("female");
        person1.setNationality("armenian");

        Person person2=new Person("Arman","Albertyan",
                           "AD454578",39,"male","armenian");

        person1.display();
        System.out.println();
        person2.display();
    }
}
