package com.company.Day1102;

import java.util.Scanner;

/**
 * Write a java program, which has 2 String variables, initialize them from console.Compare.
 */
public class Day1102 {
    public static void compareStrings1() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    /**
     * Write a java program, which has 2 String variables, initialize them, One with literal,
     * another using new keyword.Compare.
     */
    public static void compareStrings2() {

        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * Input integer value from console, if value greater than 0 print n positive, else
     * print negative.
     * - - Input integer value from console, if value greater than 0 print positive, else
     * print negative, else if 0 print 0;
     */
    public static void positiveNegativeValue() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result1 = value > 0 ? "positive" : "negative";
        String result2 = value > 0 ? "positive" : value == 0 ? "0" : "negative";
        System.out.println(result1);
        System.out.println(result2);

    }

    /**
     * achieve Math.max(a,b) function
     * achieve Math.abs(a) function
     */

    public static boolean max(int a, int b) {
        return a > b ? true : false;
    }

    public static int abs(int a) {
        return a < 0 ? -a : a;
    }

    /**
     * Using ternary operator check if the given String
     * - - is a null so return -1
     * - - if given String is “ ” return 0
     * - - else return 1
     */
    public static int check(String str) {

        return str == null ? -1 : str.equals("") ? 0 : 1;

    }

    /**
     * Write a java program to find maximum from a given 3 integer numbers using ternary
     * operator.Input numbers from console
     */
    public static int maxOfTree() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    /**
     * Write Java Program to check Vowel or Consonant using Switch Case.
     * 65-90 uppercase
     * 97-122 lowercase
     */
    public static void vowelOrConsonant(char letter) {
        int state = 0;
        if (letter + 0 >= 65 && letter + 0 <= 90) {
            state = 1;
        }
        if (letter + 0 >= 97 && letter + 0 <= 122)
            state = 2;
        switch (state) {
            case 1:
                System.out.println(letter + " is lower letter");
                break;
            case 2:
                System.out.println(letter + " is consonant letter");
                break;
            case 0:
                System.out.println("It is not a letter");
        }


    }

    /**
     * If the user pressed number keys( from 0 to 9), the program will tell the number that is
     * pressed, otherwise, the program will show "Not allowed".
     */
    public static void keyNumber(String key) {
        switch (key) {
            case "0":
            case "1":
            case "2":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("The number " + key + " is pressed");
                break;
            default:
                System.out.println("Not allowed");

        }
    }

    /**
     * Using switch statements determine if the number is even or odd.
     * Input number from console
     */
    public static void isEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number % 2) {
            case 0:
                System.out.println("Number is even");
                break;
            default:
                System.out.println("Number is odd");
        }
    }

    /**
     * Write a Java program that allows the user to choose the correct answer of a question.If
     * he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     */

    public static void chooseCorrect() {
        System.out.println("Choose correct answer: Capital of Armenia is....write answer");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        switch (answer) {
            case "Yerevan":
                System.out.println("Congratulation");
                break;
            default:
                System.out.println("Invalide choice");
        }

    }

    /**
     * Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
     * division based on the user input. The program takes the value of both the numbers (entered by user) and
     * then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
     * operation on the entered numbers using switch case.
     */
    static void calculator() {
        String output;
        System.out.println("Insert two values");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Insert operator like: + - * /");
        String operator = sc.next();
        switch (operator) {
            case "+":
                output = a + b + "";
                break;
            case "-":
                output = a - b + "";
                break;
            case "*":
                output = a * b + "";
                break;
            case "/":
                output = a / b + "";
                break;
            default:
                output = "Please insert correct operator";

        }
        System.out.println(output);

    }

    /**
     * Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2,
     * etc.
     */
    public static int setWeekday(String weekday) {

        switch (weekday) {

            case ("Monday"):
                return 1;
            case ("Tuesday"):
                return 2;
            case ("Wednesday"):
                return 3;
            case ("Thursday"):
                return 4;
            case ("Friday"):
                return 5;
            case ("Saturday"):
                return 6;
            case ("Sunday"):
                return 7;
            default:
                return 0;
        }

    }

    /**
     * The program will read three types of scores(quiz, mid-term, and final scores) and determine the
     * grade based on the following rules:
     * -if the average score >= 80% grade=A
     * -if the average score >= 60% and <80% grade=B
     * -if the average score >=40% and <60% grade=C
     * -else grade=F
     */
    public static void scoreGrade(int quiz, int mid, int fin) {
        /*
        double avgScore=(quiz+mid+fin)/3;
        String output;
        output=avgScore>=80?"gradeA":avgScore>=60?"gradeB":avgScore>=40?"gradC":"gradeF";
        System.out.println(output);
        */
        double avgScore = (quiz + mid + fin) / 3;
        int stage;
        if (avgScore >= 80)
            stage = 1;
        else if (avgScore >= 60)
            stage = 2;
        else if (avgScore >= 40)
            stage = 3;
        else stage = 4;
        String output = "";
        switch (stage) {
            case 1:
                output = "A";
                break;
            case 2:
                output = "B";
                break;
            case 3:
                output = "C";
                break;
            case 4:
                output = "F";
                break;
        }
        System.out.println("Your grad is " + output);
    }

    public static boolean isTwoPower(int number) {
        if (number == 1)
            return true;
        int n = 1;
        while (number != 2 * n) {
            n = n * 2;
            if (n > number / 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwoPowerBit(int number) {
        int number1 = number - 1;
        return (number & number1) == 0;

    }

    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
            while (true){
                String s=sc.next();
                   keyNumber(s);
    }
    */
        vowelOrConsonant('7');
    }
}
