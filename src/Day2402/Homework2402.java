package Day2402;

import java.util.Arrays;

public class Homework2402 {
    /*
    1.Write a function add with these 3 types of overloading.
static void add();
     */
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(double b, int a) {
        System.out.println(a + b);
    }


    /*
    4.Write a method called print(), which takes an array and print its contents in the form of
[a1, a2, ..., an]. Take note that there is no comma after the last element. The method&#39;s
signature is as follows:
We need to overload this method for int[ ], float[ ], double[ ] arrays.
     */
    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(float[] array) {
        System.out.println(Arrays.toString(array));
    }

    /*
    5.Write a search function, which
    - - get as an argument int[ ] array, (returns the size of array)
    public static int search(int[ ] array)
    - - get as an argument int[ ] array , also int a, and returns an index of that argument
    public static int search(int[ ] array, int a)
    - - get as an argument int[ ] array, int argument, int index
    returns true if that element is in that place in array,otherwise false

    public static boolean search(int[] array, int argument, int index)
     */
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a)
                return i;
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        return array[index] == argument;
    }

    /*
    6. Write a area() method, which
- - if get one int parameter returns the square of circle
- - if get one float parameter returns the area of square
- - if get 2 parameters returns the square of rectangle
     */
    public static double area(int radius) {
        final double pi = Math.PI;
        return pi * Math.pow(radius, 2);
    }

    public static double area(float side) {
        return side * side;
    }

    public static double area(float a, float b) {
        return a * b;
    }

    /*
    7.Write a max() function which
    - - max(int a, int b)
    - - max(int a, int b, int c)
    - - max(int a , int b, int c, int d)
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    /*

    9.Write a fahrenheitCelsius( ) function which
- - prints fahrenheit value when pass (float celsius, int choice), where choice is the type of
fahrenheit`
1 , print fahrenheit as int value
2 , print fare fahrenheit asa double value
, if pass another value print illegal argument
- - prints celsius when pass (int choice, float fahrenheit)
Example` fahrenheitCelsius(32.0, 1);
Output` 32 fahrenheit is 0 celsius
     */
    public static int fahrenheitCelsius(float celsius, int choice) {
        return (int) (celsius * 1.8 + 32);
    }

    public static double fahrenheitCelsius(int choice, float celsius) {
        return celsius * 1.8 + 32;
    }

    /*
    10.Write a function` remainder() which
- - when pass one int value, return sum of digits for that value remainder(int)
- - when pass one int value and one natural int, return reminder from sum of digits divided to
second parameter(reminder(int 331, int 5) {
return (3 + 3 + 1) % 5
     */
    public static int remainder(int value) {
        int n = value;
        int sum = 0;
        while (n / 10 != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
