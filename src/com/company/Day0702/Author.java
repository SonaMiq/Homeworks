package com.company.Day0702;

public class Author {
    String name;
    String email;
    String gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void authorInfo() {
        System.out.println(this.name + " " + this.email + " " + this.gender);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

