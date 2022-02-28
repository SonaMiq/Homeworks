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
        if (firstName == null || firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("Invalid input");
            return;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 6 || lastName.length() > 20) {

            System.out.println("Invalid input");
            return;
        }
        this.lastName = lastName;
    }

    public void setPassportId(String passportId) {


        if (passportId == null || passportId.length() != 8 || !passportId.substring(0, 2).equals("AN") || passportId.substring(2).length() != 6
                || !isDigits(passportId.substring(2))) {
            System.out.println("Invalid input");
            return;
        }


        this.passportId = passportId;
    }

    private boolean isDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
        }
        return true;
    }


    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("Invalid input");
            return;
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender == null || !(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("Invalid input");
            return;
        }
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        if (nationality == null) {
            return;
        }
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
