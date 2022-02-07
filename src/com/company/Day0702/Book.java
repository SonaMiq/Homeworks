package com.company.Day0702;

public class Book {
    String name;
    Author author;
    int price;

    Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void bookInfo() {
        System.out.println(this.name + " " + this.author.getName() + " " + this.price);
    }

    public void bookAuthorInfo() {
        System.out.println(this.author.getName() + " " + this.author.getEmail());
    }
}
