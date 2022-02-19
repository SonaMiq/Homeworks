package com.company.Day1502;

import java.util.Scanner;

public class Homework1502 {
    /*
    1. Write a java program to print all even numbers from a given
range, from a to b. Input a and b from console.Example`
Input ` 2 5 Output ` 2 4
     */
    public static void printEven(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
    2.Print all numbers on the segment from a to b that give the
    remainder of c when divided by d. If such numbers do not exist,
    then you do not need to display anything.
    Example ` Input` Output`
    a 2                   2 4
    b 5
    c 0
    d 2
     */
    public static void remainderDivided(int a, int b, int c, int d) {
        for (int i = a; i < b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }

    /*
    3.Integers a and b are entered. It is guaranteed that a does not
exceed b.
Print all numbers on the segment from a to b that are exact
squares. If there are no such numbers, then you do not need to
display anything.
Example`
Input` 2 8 Output ` 4
     */
    public static void printSquares(int a, int b) {
        if (a * a > b) {
            System.out.println("There isn't any squares");
            return;
        }
        for (int i = a; i < b; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i))
                System.out.println(i + " ");
        }
    }


    /*
4.Enters 2 integer numbers : x and d from console
Count and print one number - how many times the digit d occurs in
the representation of a natural number x.
 */
    public static int digitOccursCount(int x, int d) {
        int count = 0;
        for (int i = x; i != 0; i = i / 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        return count;
    }

    /*
    5. Given an integer number x
Print the number consisting of the digits of the given number x in reverse
order. You do not need to output leading zeros.
     */
    public static void reverse(int number) {
        int output = 0;
        for (int i = number; i != 0; i = i / 10) {
            output = output * 10 + i % 10;
        }
        System.out.println(output);
    }

    /*
    6.Given an integer number x
Find the smallest natural divisor of x other than 1 (2 <=x<= 30000).
Example`
Input` 6 Output` 2
     */
    public static int smallestDivisor(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return i;
        }
        return x;
    }

    /*
    7.Given an integer number x
    Print all natural divisors of the number x in ascending order (including 1
    and the number itself).
    Example` Input ` 32 Output ` 1 2 4 8 16 32
     */
    public static void allDivisors(int x) {
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0)
                System.out.println(i);
        }
        System.out.println(x);
    }

    /*
    8.Given an integer x
    Count the number of natural divisors of x (including 1 and the number
    itself).
     */
    public static int divisorsCount(int x) {
        int divCount = 2;//1 and itself
        for (int i = 2; i * i < x; i++) {
            if (x % i == 0) {
                divCount += 2;
            }
            if (x / i == i) {//if div sqrt: for 16->4
                divCount--;
            }
        }
        return divCount;
    }

    /*
    9.Calculate the sum of the given 10 natural numbers.
Input integers from console
     */
    public static int sumOfTen() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
        }
        return sum;
    }


    /*
    10. Convert a natural number from binary to decimal (no more than 10
    digits in a binary number).
    Example` Input ` 1001 Output` 9
    111 Output` 7
     */
    public static int binaryToDecimal(int number) {

        int output = 0;
        int degreeOfTwo = 1;
        for (int i = number; i != 0; i /= 10) {
            output += degreeOfTwo * (i % 10);
            degreeOfTwo *= 2;
        }
        return output;
    }

    /*
    11.Enter the number N, followed by N integers.

- Count how many zeros, positive numbers, negative numbers
among the given N numbers.

- It is necessary to print first the number of zeros, then the number
of positive and negative numbers.
   */
    public static void checkCounts(int n) {
        Scanner scanner = new Scanner(System.in);
        int zerosCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            if (input > 0) {
                positiveCount++;
            } else if (input < 0) {
                negativeCount++;
            } else zerosCount++;
        }
        if (zerosCount != 0)
            System.out.println("Zeros count: " + zerosCount);
        if (negativeCount != 0)
            System.out.println("Negative count: " + negativeCount);
        if (positiveCount != 0)
            System.out.println("Positive count: " + positiveCount);
    }

    /*
    12. "GNCHE-1"  is a complex electronic device that issues every second
    the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high
    cost of electronic components, you have been instructed to develop an
    emulator for these devices.
    The number of seconds (from 1 to 1,000,000) is given that the generator
    works after being turned on.
     */
    public static void emulator(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                count++;
                if (count == n) {
                    return;
                }
            }

        }
    }


    /*
    13. Write a Java program by using two for loops to produce the output
shown below:
Input N natural number, print picture like below in size N*N
***********
***********
***********
***********
     */
    public static void twoLoop(int n, String s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s);
            }
            System.out.print("\n");
        }
    }

    /*
    14.Write a program that prompts the user for the size (a non-negative
    integer in int); and prints the following checkerboard pattern.

   */
    public static void twoLoopUserInsert(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }

            System.out.print("\n");
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(" ");
        }
    }

    /*
    15.Write a program that prompts user for the size (a positive integer in
int); and prints the multiplication table as shown:
     */
    public static void multiplicationTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
/*
16. Write 4 programs (X = A, B, C, D) that prompts user for the
size (a non-negative integer in int); and prints each of the patterns as
shown:

Enter the size: 4
* **** **** *
** *** *** **
*** ** ** ***
**** * * ****
a) b) c) d)
 */

    public static void a(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void b(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void c(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void d(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        emulator(5);
    }
}


