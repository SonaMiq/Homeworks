package com.company.Day2302;

import com.company.Day1702.Homework1702;

import java.util.Locale;

public class Homework2302 {
    /*
    A natural number N is given (entered from the keyboard). Calculate two to the power of N
Display the calculated value (1 <= N<= 15).
     */
    public static int twoPower(int n) {
        if (n < 1 || n > 15) {
            return -1;
        }
        int output = 1;
        for (int i = 1; i <= 15; i++) {
            output *= 2;
        }
        return output;
    }

    /*
    Given number n. N minutes have passed since the beginning of the day. Determine how many
    hours and minutes the digital clock will show at this moment. The program should print two
    numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that
    the number n can be more than the number of minutes in a day.
     */
    public static void clockAfterMinutes(int n) {
        int hours = n / 60;
        int minutes = n % 60;
        System.out.println(hours % 24 + ":" + minutes);
    }

    /*
    Write a java program to determine whether the number is prime or not.
     */
    public static boolean isPrime(int number) {
        if (number == 1 || number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    6.You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A
    to B, the record of which is a palindrome.
     */
    public static void palindrome(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int input = number;
        int n = 0;
        while (input != 0) {
            n = n * 10 + input % 10;
            input /= 10;
        }

        return number == n;
    }

    /*
    A three-letter word is given. The word consists only of Latin letters, small and large. Print the
    same word, where the first letter is capitalized, the rest are small.
     */
    public static String convert(String s) {
        return s.toUpperCase(Locale.ROOT).substring(0, 1) + s.toLowerCase(Locale.ROOT).substring(1);
    }


    /*
    8.Enter the number N and draw an NxN checkerboard where the top left is white. Designate white
margins O, black margins X. Use a for loop.
     */
    public static void draw(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    System.out.print("X");
                } else
                    System.out.print("O");
            }
            System.out.println();
        }
    }

    /*
    9.The first term and the denominator of the geometric progression are given (real numbers b1 and
q, q! = 0). An integer n is also given. Print the n-th term of a geometric progression. Don't use the
pow function, use a for loop. Print the answer with precision exactly two characters after the
period.
     */
    public static double geometric(double first, double step, int n) {
        double out = first;
        int i = 1;
        while (i < n) {
            out *= step;
            i++;
        }
        String strOut = String.format("%.f", out);
        return Double.parseDouble(strOut);
    }

    /*
    10.A natural number> = 2 is specified. Expand it into prime factors.
    Example` Input` 120 2*2*2*3*5
     */
    public static void primeFactors(int number) {
        String out = "";
        int n = number;
        int i = 2;
        while (!isPrime(n)) {
            if (n % i == 0 && isPrime(i)) {
                out += i + "*";
                n = n / i;
            } else i++;

        }
        System.out.println(out + n);
    }

    /*
    *11.Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the
multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire
filling of the array must be done in one cycle.
     */
    public static int[][] twoDimensionalMult(int n, int m) {
        int[][] matrix = new int[n][m];
        int j = 0;
        for (int i = 0; i < n; i++) {
            matrix[i][j] = matrix[j][i] = i * j;
            j++;
            --i;
            if (j == m) {
                j = 0;
                i++;
            }

        }
        return matrix;

    }

    /*
    13.Given numbers n and m. Create an array A [n] [m] and fill it with a snake.
     */
    public static int[][] matrixEx2(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {

                    arr[i][j] = i * 10 + j;
                }
            } else {
                for (int j = 0; j < m; j++) {

                    arr[i][j] = i * 10 + m - 1 - j;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Homework1702.printMatrix(matrixEx2(4, 10));

    }
}






