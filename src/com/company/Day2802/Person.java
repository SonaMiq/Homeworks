package com.company.Day2802;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    Person() {

    }

    Person(String firstName, String lastName, String passportId,
           int age, String gender, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassportId(passportId);
        setAge(age);
        setGender(gender);
        setNationality(nationality);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setPassportId(String passportId) {

        this.passportId = passportId;
    }




    public void setAge(int age) {

        this.age = age;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setNationality(String nationality) {

        this.nationality = nationality;
    }

    public void display() {
        System.out.println("Firstname : " + getFirstName());
        System.out.println("Lastname : " + getLastName());
        System.out.println("passportID: " + getPassportId());
        System.out.println("age: " + getAge());
        System.out.println("gender: " + getGender());
    }

}
