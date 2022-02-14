package com.company.Day1402;

import java.util.*;

import static com.company.Day1102.Day1102.isTwoPower;

public class Homework1402 {
    //Print all integer numbers from 1 to 10.

    public static void printOneToTen() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
    }
    //Print all even integer numbers from 1 to 20.

    public static void printEvenOneToTwenty() {
        int i = 2;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    /*Print all exact squares of natural numbers that are not
    exceeding a given positive integer N. Input N from console.
    */
    public static void printExactSquares() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }

    /*
     Given an integer number, greater than 2.Find and print the
smallest natural divisor other than 1 for a given number.Input
number from console.Example
     */
    public static void smallDivisor(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                break;
            }
            i++;
        }

        System.out.println(i);
    }

    /*
    Print all integer powers of two not exceeding N in ascending
    order.Input N from console. Example ` Input 50(You can not use
    Math.pow())
     */
    public static void powersOfTwo(int n) {

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i *= 2;
        }
    }

    //For a given integer number N,print all integers in descending order.

    public static void descendingOrder(int n) {
        int i = n;
        while (i != 0) {
            System.out.println(i);
            i--;
        }
    }

    //For a given integer number N,print all integers that are multiple of 2 in descending order.
    public static void multipleOfTwoDesc(int n) {
        int i = n;
        while (i != 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }

    }

    /*
     Input N natural number till N would be the exact power of 2.If N is
    the exact power of 2 .
    - Print N
    - Print count of input integers
    - break loop
     */
    public static void checkAndCount() {
        //  int input;
        //int inputsCount = 0;
        Scanner sc = new Scanner(System.in);
/*
       do{
          input= sc.nextInt();
          inputsCount++;
       }
        while (!isTwoPower(input));
        System.out.println(input+" "+inputsCount);

*/

        int input;
        int inputsCount = 0;
        while (true) {

            input = sc.nextInt();
            inputsCount++;
            if (isTwoPower(input)) {
                break;
            }
        }
        System.out.println(input + " " + inputsCount);
    }

    /*
    For a given natural N print the smallest integer k that`
    Math.pow(2,k)≥N.(You can not use Math.pow())
     */
    public static int aaa(int n) {

        int k = 0;
        int res = 1;
        while (true) {
            if (res >= n) {
                break;
            }
            res *= 2;
            k++;

        }
        return k;
    }

    /*
    Write Java program to print the table of characters that are
equivalent to the Ascii codes from 32 to 122.Print 10 characters
at each line.
     */
    public static void charTable() {
        int i = 32;
        while (i < 122) {
            int j = 0;
            while (j < 10) {
                System.out.print((char) i);
                j++;
                i++;
            }
            System.out.println("\n");
        }
    }

    /*
    Print all integer numbers from 1 to N, except that are multiple of
    3(Input N from console)
     */
    public static void printExceptMultipleOfTree(int n) {
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    /*
    Given integer number A > 1,define what is the Fibonacci number
is A, i.e print such number n that φn=A.If A is not a Fibonacci
number print -1. Example
     */
    public static int fibonacciNumber(int input) {
        int a1 = 0;
        int a2 = 1;
        int next = a1 + a2;
        int index = 1;
        while (next != input) {
            if (next > input) {
                return -1;
            }
            next = a1 + a2;
            a1 = a2;
            a2 = next;
            index++;
        }
        return index;
    }

    /*
    On the first day, the athlete ran x kilometers,and then every day
he increased the mileage by 10% from the previous value,Given the
number y, determine the number of the day for which the athlete´s
mileage will be at least y kilometers.
     */
    public static int athleteMileage(double x, double y) {
        int days = 1;
        while (x < y) {
            x = x + x * 0.1;
            System.out.println(x);
            days++;
        }
        return days;
    }

    /*
    The deposit in the bank is x dollars. It increases annually by p
percent, after which the fractional part of cents is discarded.
Determine how many years the contribution will be at
least y dollars.
     */
    public static int bankDeposit(int x, int p, int y) {
        int years = 0;
        while (x < y) {
            x += 0.1 * x;
            years++;
        }
        return years;
    }

    /*
    The sequence consists of different natural numbers and ends
    with the number 0. Determine the value of the second largest
    element in this sequence.
     */
    public static void secondLargestSequence() {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(15);
        sequence.add(28);
        sequence.add(5);
        sequence.add(78);
        sequence.add(100);
        sequence.add(0);

        int i = 0;
        int maximum = sequence.get(0);
        int secondMax = 0;
        while (sequence.get(i) != 0) {
            if (sequence.get(i) > maximum) {
                secondMax = maximum;
                maximum = sequence.get(i);
            }
            i++;
        }
        System.out.println(secondMax);
    }


    /*
    Write a program that generates a random number and asks the user
to guess what the number is. If the user’s guess is higher than the
random number, the program should display Too high, try again. If the
user’s guess is lower than the random number, the program should
display Too low, try again. If you find the number print Yes, you
guessed the number.The program should use a loop that repeats
until the user correctly guesses the random number.
     */
    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(20);
        int userNumber;
        while (true) {
            userNumber = scanner.nextInt();
            if (userNumber < number) {
                System.out.println("Too low,try again");
            } else if (userNumber > number) {
                System.out.println("Too high,try again");
            } else {
                System.out.println("Yes, you guessed the number!!!");
                break;
            }
        }
    }


    // Write a Java Program to Compute the Sum of Digits in a given Integer.
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // System.out.println(athleteMileage(10,15));
        System.out.println(athleteMileage(10,12));
    }
}
