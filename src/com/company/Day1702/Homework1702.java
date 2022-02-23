package com.company.Day1702;

import com.company.Day1602.Homework1602;

import java.util.Random;

public class Homework1702 {
    /*
    1.Create an n × n array and fill it according to the following rule:
- the numbers on the diagonal going from the upper right to the lower left
corner are equal to 1;
- the other elements are 0;
- print matrix
     */
    public static void matrixDiagonalOne(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                }
            }
        }
        printMatrix(array);

    }

    /*
    2.Create an n × n array and fill it according to the following rule:
    - the numbers on the diagonal going from the upper right to the lower left
    corner are equal to 1;
    - numbers above this diagonal are equal to 0;
    - the numbers below this diagonal are equal to 2
    Input n from console
     */
    public static void aaa(int size) {
        boolean diaganal;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            diaganal = false;
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                    diaganal = true;
                } else if (diaganal) {
                    array[i][j] = 2;
                }
            }
        }
        printMatrix(array);
    }

    /*
    3.Check if the two-dimensional array is symmetrical about the main
    diagonal. The main diagonal is the one that goes from the upper left
    corner of the two-dimensional array to the lower right.
    Example` Input` 3 Input` 3
    0 1 2             0 0 0
    1 5 3             0 0 0
    2 3 4             1 0 0
    Output` YES       Output` NO
     */
    public static boolean checkSymmetric(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    4.There are n athletes competing in hammer throw. Each of them made
    m throws. The winner is the athlete who has the maximum result for all
    throws.
    If the athletes are renumbered from 0 to n-1, and the attempts of each of
    them are from 0 to m-1, then the program receives an array A [n] [m],
    consisting of non-negative integers, as input. The program should
    determine the maximum amount of numbers in one line and display this
    amount and the line number for which this amount is reached.

    Input` The program receives as input two numbers n and m, which are
    the number of rows and columns in the array. Then in the input stream
    there are n lines containing m numbers each, which are the elements of
    the array.
    Output` The program should display 2 numbers: the amount and the line
    number for which this amount is reached. If there are several such lines,
    then the number of the smallest of them is displayed. Do not forget that
    line numbering (for athletes) starts at 0.
     */
    public static void rowElementsSumMax(int n, int m) {

        int[][] array = generateArray(n, m);
        printMatrix(array);
        int[] sumOfEachRow = new int[n];
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            sumOfEachRow[i] = sum;
        }
        Homework1602.printMaxAndIndex(sumOfEachRow);
    }

    /*
    5.There are n athletes competing in hammer throw. Each of them made
m throws. The winner of the competition is the athlete who has the best
result in all throws. Thus, the program must find the value of the
maximum element in the given array, as well as its indices (that is, the
number of the athlete and the number of the attempt).
Input `
The program receives as input two numbers n and m, which are the
number of rows and columns in the array. Then in the input stream there
are n lines containing m numbers each, which are the elements of the
array.
Output`
The program prints out the value of the maximum element, then the
row number and the column number in which it occurs. If there are
several maximum elements in the array, then you need to display the
minimum line number in which such an element occurs, and if there are
several such elements in this line, then you need to display the minimum
column number. Remember that all rows and columns are numbered
from 0.
     */
    public static void maxElementInMatrix(int n, int m) {
        int[][] array = generateArray(n, m);
        printMatrix(array);
        int max = 0;
        int row = 0, column = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    column = j;
                }
            }
        System.out.println(max + "   " + row + "   " + column);
    }

    /*
    6.There are n athletes competing in hammer throw. Each of them made
    m throws. The athlete with the highest best throw wins. If there are
    several of them, then the one with the best sum of results for all attempts
    wins. If there are several of them, the athlete with the minimum number
    is considered the winner. Determine the number of the winner of the
    competition.

    Input` The program receives as input two numbers n and m, which are
    the number of rows and columns in the array. Then in the input stream
    there are n lines containing m numbers each, which are the elements of
    the array.
    Output` The program should display one number - the number of the
    winner of the competition. Do not forget that the lines (athletes) are
    numbered from 0.
     */
    public static void maxAndSumMax(int n, int m) {
        int[][] array = generateArray(n, m);
        printMatrix(array);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {

            }
    }

    public static int[][] reverse180(int[][] array) {
        printMatrix(array);
        System.out.println();
        int n = array.length;
        int m = array[0].length;
        int temp;
        int step = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (step == (n * m) / 2) {
                    return array;
                }
                temp = array[i][j];
                array[i][j] = array[n - 1 - i][m - 1 - j];
                array[n - 1 - i][m - 1 - j] = temp;
                step++;
            }
        }
        return array;
    }


    /*
    8.Write a Java program to add two matrices of the same size.
     */
    public static int[][] sum(int[][] arr1, int[][] arr2) {
        printMatrix(arr1);
        System.out.println("______________");
        printMatrix(arr2);
        System.out.println("______________");
        int n = arr1.length;
        int m = arr1[0].length;
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        return sum;
    }

    /*
  9.It is required to fill an array of size N × N with ones in a spiral (starting
from the upper left corner clockwise, see example).
   */
    public static int[][] generateSpiral(int n, int m) {
        int[][] array = new int[n][m];

        int k = 0;
        int i = 0, j = 0;
        while (k < n) {
            while (j < m - k - 1) {
                array[i][j] = 1;
                j++;
            }
            while (i < n - k - 1) {
                array[i][j] = 1;
                i++;
            }
            while (j >= 0 + k) {
                array[i][j] = 1;
                j--;
            }
            j = 0 + k;
            k += 2;
            while (i > k) {
                array[i][j] = 1;
                i--;
            }

        }

        return array;
    }


    public static int[][] generateArray(int n, int m) {
        Random random = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        return array;
    }

    public static int[][] generateSymmetricArray(int n) {
        Random rand = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int value = rand.nextInt(10);
                array[i][j] = value;
                array[j][i] = value;
            }
        }

        return array;
    }

    public static void printMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = generateSpiral(11, 11);
        printMatrix(array);

    }
}
