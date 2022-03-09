package com.company.Day0903;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(String message) {
        System.out.println(message);
    }
}
