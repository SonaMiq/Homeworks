package com.company.Day0203;

public class Main {

    public static void main(String[] args) {
        boolean[] a= {true,true};
        System.out.println(howMany(true, a));
    }
    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }
}
