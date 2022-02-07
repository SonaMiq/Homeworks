package com.company.Day0702;

public class BookTest {

    public static void main(String[] args) {

        Author author = new Author("Sara", "sara@gmail.com", "female");
        Book book1 = new Book("Sevan", author, 2350);
        Book book2 = new Book("Van", author, 5400);
        book1.bookInfo();
        book2.bookInfo();
    }
}
