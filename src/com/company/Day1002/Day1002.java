package com.company.Day1002;

import java.util.Random;
import java.util.Scanner;

public class Day1002 {

    /**
     * This method  allow the user to input his/her age and show  the person is eligible to vote.
     * A person who is eligible to vote must be older  or equal to 18 years old.
     */

    public static boolean voteCheck() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You have eligible to vote");
            return true;
        } else {
            System.out.println("You don't have eligible to vote");
            return false;
        }
    }

    /**
     * This method determine is  the number even
     *
     * @param number
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * This method generate number 2to7 without bound method
     */
    public static int generateNumber2To7() {

        Random random = new Random();
        int number = random.nextInt();
        if (number < 0)
            number *= -1;
        return number % 6 + 2;
    }

    /**
     * This method  determine is input number multiple of a 5.
     *
     * @param number
     */
    public static boolean isMultiple5(int number) {
        return number % 5 == 0;
    }

    /**
     * This number find greatest number of given tree numbers
     *
     * @param a,b,c
     */
    public static int greatestOfTree(int a, int b, int c) {
        int greatest = a;
        if (b > greatest)
            greatest = b;
        if (c > greatest)
            greatest = c;
        return greatest;
    }

    /**
     * This method read a floating-point number and print
     * Zero if the number is zero. Otherwise, print positive or negative;.
     * Add small if the absolute value of the number is less than 1, or
     * largeif it exceeds 1,000,000
     *
     * @param number
     */
    public static void checkFloatNumber(float number) {
        if (number == 0)
            System.out.println("Zero");
        else {
            if (number < 0)
                System.out.println("Negative");

            else
                System.out.println("Positive");
        }
        if (Math.abs(number) < 1)
            System.out.println("small");

        else if (Math.abs(number) > 1000000)
            System.out.println("Large");
    }

    /**
     * This method keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     *
     * @param number this number can be any number
     */
    public static void weekDays(int number) {
        int n = number % 7 + 1;
        if (n == 1)
            System.out.println("Monday");
        else if (n == 2)
            System.out.println("Tuesday");
        else if (n == 3)
            System.out.println("Wednesday");
        else if (n == 4)
            System.out.println("Thursday");
        else if (n == 5)
            System.out.println("Friday");
        else if (n == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
    }

    /**
     * In the cafe  sell an ice-cream with 3 balls and 5 balls.Input K integer
     * value from console. This method checked is you can buy exactly K balls ice-cream.
     *
     * @param k
     */
    public static boolean checkedIceCreamBalls(int k) {

        if (k % 3 == 0 || k % 5 == 0)
            return true;
        int n = k;
        while (n > 3) {
            n = n - 3;
            if (n % 5 == 0)
                return true;
        }
        n = k;
        while (n > 5) {
            n = n - 5;
            if (n % 3 == 0)
                return true;
        }
        return false;
    }

    /**
     * This method takes a year from the user and print is a leap year or not.
     */
    public static boolean leapYear(int year) {
        if (year % 4 != 0)
            return false;
        if (year % 100 != 0)
            return true;
        if (year % 400 != 0)
            return false;
        return true;
    }

    /**
     * This method generate random integer value, print true if random value
     * corresponds these conditions, else print false:
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple of 5
     */
    public static void bbb() {
        Random random = new Random();
        int value = random.nextInt();
        boolean b = false;
        if (value > -1000 && value < 1000 && (value % 3 == 0 || value % 5 == 0))
            b = true;
        System.out.println(b);
        System.out.println(value);
    }

    /**
     * This method get from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this a is legal b is illegal
     * - a > 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a > 10 b < 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     */

    public static void ccc(int a, int b) {
        /////////////////////
        if (a > 10 && b != 10)
            System.out.println("Both a and b legal");
        else {
            if (a > 10)
                System.out.println("a is legal b is illegal");
            else if (b != 10)
                System.out.println("b is legal a is illegal");
            else
                System.out.println("Both a and b illegal");
        }
        /////////////
        if (a >= 0 && b >= 0)
            System.out.println("Both a and b legal");
        else {
            if (a >= 0)
                System.out.println("a is legal b is illegal");
            else if (b >= 0)
                System.out.println("b is legal a is illegal");
            else
                System.out.println("Both a and b is illegal");
        }
        ///////////
        if (a < 0 && b < 0)
            System.out.println("Both a and b legal");
        else {
            if (a < 0)
                System.out.println("a is legal b is illegal");
            else if (b < 0)
                System.out.println("b is legal a is illegal");
            else System.out.println("Both a and b is illegal");
        }
        //////////
        if (a > 10 && b < 1 && a % 2 != 0 && b % 2 != 0)
            System.out.println("Both a and b legal");
        else {
            if ((a <= 10 || a % 2 == 0) && b < 1 && b % 2 != 0)
                System.out.println("b is legal,a is illegal");
            else if ((b >= 1 || b % 2 == 0) && a > 10 && a % 2 != 0)
                System.out.println("a is legal,b is illega");
            else System.out.println("Both a and b is illegal");
        }
        ////////////
        if (a % 5 == 0 || b % 5 == 0)
            System.out.println("Both a and b is legal");
        else
            System.out.println("Both a and b is illegal");
        //////////
        if (a % 5 != 0 && b % 5 == 0)
            System.out.println("Both a and b is legal");
        else {
            if (a % 5 != 0)
                System.out.println("a is legal, b is illegal");
            else if (b % 5 == 0)
                System.out.println("b is legal, a is illegal");
            else
                System.out.println("Both and b is illegal");
        }
    }

    /**
     * This method checked if one of given numbers (a,b) is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * else print all even values between them
     *
     * @param a,b
     */

    public static void aaa(int a, int b) {
        if ((a % 7 == 0 || b % 7 == 0) && a > 0 && b > 0 && a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        } else {
            if (a < b)
                for (int i = a; i < b; i++) {
                    if (i % 2 == 0)
                        System.out.println(i);
                }
            else
                for (int i = b; i < a; i++) {
                    if (i % 2 == 0)
                        System.out.println(i);
                }
        }
    }


    /**
     * This method checked is triangle of given 3 positive numbers different from 0 is
     * a non-degenerate triangle.
     *
     * @param a
     * @param b
     * @param c
     * @return true, if triangle is non-generate
     * false, otherwise
     */
    public static boolean nonDegenerateTriangle(int a, int b, int c) {

        //  a + b > c a + c > b b + c > a
        return (a + b > c && a + c > b && b + c > a);
    }

    /**
     * This method print count of given three numbers that equals to each other.
     *
     * @param a
     * @param b
     * @param c
     * @return count of equals numbers
     */
    public static int countOfEqualsNumbers(int a, int b, int c) {

        if(a==b&&b==c)
            return 3;
        else if (a==b||a==c||b==c)
            return 2;
        else
            return 0;
    }

    /**
     * This method find all decisions for
     * ax2 + bx + c = 0 and print all decisions, if there is not a
     * decision ,print Can't be.
     *
     * @param a,b,c
     */
    public static void decision(double a, double b, double c) {
        //ax2+bx+c=0
        double d = b * b - 4 * a * c;

        if (d < 0)
            System.out.println("Can't be");
        else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (d == 0)
                System.out.println("x1=x2= " + x1);
            else
                System.out.println("x1= " + x1 + " x2= " + x2);
        }
    }

    /**
     * This method arrange given 3 integer values  in non-decreasing order and print.
     *
     * @param a,b,c
     */
    public static void arrangeTreeNumbers(int a, int b, int c) {
        if (a == minOfTree(a, b, c)) {
            if (b < c)
                System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else {
            if (b == minOfTree(a, b, c)) {
                if (a < c)
                    System.out.println(b + " " + a + " " + c);
                else
                    System.out.println(b + " " + c + " " + a);
            }
            if (c == minOfTree(a, b, c)) {
                if (a < b)
                    System.out.println(c + " " + a + " " + b);
                else
                    System.out.println(c + " " + b + " " + a);
            }
        }
    }

    public static int minOfTree(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        else if (c < min)
            min = c;
        return min;
    }

    public static boolean inSameQuarter(int x1, int y1, int x2, int y2) {
        return ((x1 > 0 == x2 > 0) && (y1 > 0 == y2 > 0));
    }

    public static void main(String[] args) {
        System.out.println(checkedIceCreamBalls(14));

    }
}



