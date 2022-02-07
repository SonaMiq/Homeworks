
package com.company.Day0402;

import java.util.Scanner;

public class Day0402 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert byte number");
        byte byteNum = sc.nextByte();
        castLowToHigh(byteNum);

        System.out.println("Please insert double number");
        double doubleVar = sc.nextDouble();
        castHighToLow(doubleVar);

        System.out.println("Fahrenheit temperature");
        double tF = sc.nextDouble();
        tFTotC(tF);

        System.out.println("Please enter circle radius");
        double radius = sc.nextDouble();
        circleAreaPerimeter(radius);

        oneDivThreeDoubleFloat();

        printNameBirthday();

        System.out.println("\n Please insert one symbol");
        char c = sc.next().charAt(0);
        System.out.println(charToInt(c));


        parsNameToIntegerAndAvg();

        System.out.println("Please insert value in range 32 to 127");
        byteNum = sc.nextByte();
        intToChar(byteNum);


        stringConcat();

        swapInt(4, 7);

    }

    /**
     * This method cast byte type variable to int,int to long,long to float, float to double
     * and print both values after every casting
     *
     * @param byteNum
     */
    public static void castLowToHigh(byte byteNum) {
        short shortVar = byteNum;
        System.out.println(byteNum + " " + shortVar);
        int intVar = shortVar;
        System.out.println(shortVar + " " + intVar);
        long longVar = intVar;
        System.out.println(intVar + " " + longVar);
        float floatVar = longVar;
        System.out.println(longVar + " " + floatVar);
        double doubleVar = floatVar;
        System.out.println(floatVar + " " + doubleVar);
    }

    /**
     * This method cast double type variable to float,float to long,long to int, int to short
     * and print both values after every casting
     *
     * @param doubleVar
     */
    public static void castHighToLow(double doubleVar) {

        float floatVar = (float) doubleVar;
        System.out.println(doubleVar + " " + floatVar);
        long longVar = (long) floatVar;
        System.out.println(floatVar + "  " + longVar);
        int intVar = (int) longVar;
        System.out.println(longVar + "  " + intVar);
        short varShort = (short) intVar;
        System.out.println(intVar + " " + varShort);
        byte byteVar = (byte) varShort;
        System.out.println(varShort + " " + byteVar);
    }

    /**
     * This method converse temperature Fahrenheit to Celsius degree and print result
     * and result in int type
     *
     * @param tF
     */
    public static void tFTotC(double tF) {

        double tC = (tF - 32) * 5 / 9;
        System.out.println(tC);
        float fResult = (float) tC;
        System.out.println(fResult);
        int iResult = (int) fResult;
        System.out.println(iResult);
    }

    /**
     * This method compute area and perimeter for given radius circle
     *
     * @param radius
     */
    public static void circleAreaPerimeter(double radius) {
        double PI = 3.14159;
        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.println(perimeter + " " + area);
    }

    /**
     * This method print 1/3 value as double, as float
     */
    public static void oneDivThreeDoubleFloat() {
        double doubleRes = (double) 1 / 3;
        float floatRes = (float) 1 / 3;
        System.out.println(doubleRes + " " + floatRes);
    }

    /**
     * This method print my name and birthday year
     */
    public static void printNameBirthday() {
        char char1 = 'S', char2 = 'o', char3 = 'n', char4 = 'a';
        int birthDate = 1988;
        System.out.print(char1);
        System.out.print(char2);
        System.out.print(char3);
        System.out.print(char4);
        System.out.print(birthDate);
    }

    /**
     * This mrthod cast char variable to int
     *
     * @param charVar
     */
    public static int charToInt(char charVar) {
        int intVar = charVar;
        return intVar;
    }

    /**
     * This method pars my name letters to integers,calculate average og them and print results
     */
    public static void parsNameToIntegerAndAvg() {
        char char1 = 'S', char2 = 'o', char3 = 'n', char4 = 'a';
        int int1 = char1 + 0, int2 = char2 + 0, int3 = char3 + 0, int4 = char4 + 0;
        System.out.println(int1 + " " + int2 + " " + int3 + " " + int4);
        System.out.println((double) (char1 + char2 + char3 + char4) / 4);
    }

    /**
     * This method get integer value of range 32 to 127 print corresponding char to this value
     *
     * @param value
     */
    public static void intToChar(byte value) {
        char c = (char) value;
        System.out.println(c);
    }

    /**
     * This method concatenate tw
     * o my own strings
     */
    public static void stringConcat() {
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = str1 + str2;
        System.out.println(str3);
    }

    /**
     * This method swap two integers without other variable
     */
    public static void swapInt(int a, int b) {

        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

    }
}



