package com.company.Day2303;

public class Recursion {
    /*  1.Write a recursive function
              - to find the sum of a given array.
              - to find the factorial of a given natural N.

     */
    public static int sumOfArray(int[] array) {
        return sum(array, array.length - 1);
    }

    private static int sum(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return array[index] + sum(array, index - 1);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    /*
    2.Write a fib(int) function which returns n-th fibonacci number.
     */
    public static int fibonachi(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonachi(n - 2) + fibonachi(n - 1);
    }

    /*
    3.We have triangles made of blocks. The topmost row has 1 block, the
next row down has 2 blocks, the next row has 3 blocks, and so on. Compute
recursively (no loops or multiplication) the total number of blocks in
such a triangle with the given number of rows.
     */

    public static int triangleBlocks(int row) {
        if (row == 0)
            return 0;
        if (row == 1)
            return 1;

        return triangleBlocks(row - 1) + row;
    }

    /*
    4.Given a non-negative int n, return the sum of its digits recursively (no
    loops).
     */
    public static int sumOfDigits(int number) {
        if (number == 0)
            return 0;
        return number % 10 + sumOfDigits(number / 10);
    }

    /*
    5.Given a non-negative int n, return the count of the occurrences of 7 as
a digit, so for example 717 yields 2.
     */
    public static int digitOccurrences(int number, int digit) {
        if (number == 0)
            return 0;
        if (number % 10 == digit)
            return 1 + digitOccurrences(number / 10, digit);
        return digitOccurrences(number / 10, digit);
    }

    /*
    6.Given a string, compute recursively (no loops) the number of
    lowercase x chars in the string.
     */
    public static int charOccurrences(String s, char c) {
        if (s.length() == 0)
            return 0;
        if (s.charAt(0) == c)
            return 1 + charOccurrences(s.substring(1), c);
        return charOccurrences(s.substring(1), c);
    }

    /*
    7.Given a string, compute recursively a new string where all the &#39;x&#39; chars
    have been removed.
    Use` str.substring()
     */
    public static String removeChar(String s, char c) {
        if (s.length() == 0)
            return "";
        if (s.charAt(0) == c)
            return removeChar(s.substring(1), c);
        return s.charAt(0) + removeChar(s.substring(1), c);
    }

    /*
    8.Write recursive function that reverses the given String.
Example` HELLO -&gt; OLLEH
     */
    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    /*
    9.Given a string, compute recursively a new string where all the
    lowercase x chars have been moved to the end of the string.
     */
    public static String moveToEnd(String s, char c) {
        if (s.length() == 0)
            return "";
        if (s.charAt(0) == c)
            return moveToEnd(s.substring(1), c) + s.charAt(0);
        return s.charAt(0) + moveToEnd(s.substring(1), c);
    }

    /*
    10.Given a string, return recursively clean string where adjacent
chars that are the same have been reduced to a single char.
     */
    public static String clean(String s) {
        if (s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        if (s.charAt(0) == s.charAt(1))
            return clean(s.substring(1));
        return s.charAt(0) + clean(s.substring(1));
    }

    /*
    11.Write a function to determine if a number is prime or not.
     */
    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        return isPrime(number, 2);
    }

    private static boolean isPrime(int number, int i) {
        if (i == number / 2)
            return true;
        if (number % i == 0)
            return false;
        return isPrime(number, i + 1);
    }

    /*
    12.Given a string containing only decimal digits. Find and display the
largest digit.
     */
    public static int largeDigit(String s) {
        if (s.length() == 1)
            return Integer.parseInt(s);
        if (s.charAt(0) > s.charAt(1))
            return largeDigit(s.substring(1) + s.charAt(0));
        return largeDigit(s.substring(1));
    }

    /*
    13.You are given a string containing numbers and English letters
    (uppercase and lowercase). Find and display the number of digits.
     */
    public static int numberOfDigits(String s) {
        if (s.length() == 0)
            return 0;
        try {
            Integer.parseInt(s.substring(0, 1));
            return 1 + numberOfDigits(s.substring(1));
        } catch (NumberFormatException e) {
            return numberOfDigits(s.substring(1));
        }
    }
    /*
    14.Given a string containing only English letters (uppercase and
lowercase). Add the ‘*’ (asterisk) character between letters (you don’t
need to add ‘*’ before the first letter and after the last).
     */
    public static String addCharBetweenLetters(String s, char c) {
        if (s.length() == 1)
            return s;
        return s.charAt(0) + "" + c + addCharBetweenLetters(s.substring(1), c);
    }

    /*
    15.Given a string containing only English letters (uppercase and
    lowercase). Add opening and closing parentheses according to the
    following pattern: &quot;example&quot; -&gt; &quot;(e (x (a (m) p) l) e)&quot; (Added opening
    parentheses to the middle, closing parentheses after the middle. In case
    the string length is even there must be 2 characters in the brackets in the
    middle.
     */

    public static String addParentheses(String s) {
        return addParentheses(s, s.length());
    }

    private static String addParentheses(String s, int n) {
        if (s.length() == 0)
            return ")";

        if (s.length() > n / 2) {
            return '(' + "" + s.charAt(0) + addParentheses(s.substring(1), n);
        }

        if (s.length() == n / 2 && n % 2 == 0) {
            return s.charAt(0) + addParentheses(s.substring(1), n);
        }
        return ')' + "" + s.charAt(0) + addParentheses(s.substring(1), n);
    }

    /*
    16.Given a string containing only English letters (uppercase and
    lowercase) and opening brackets. Form a new line by adding a
    "mirrored"; line with closing brackets to the right.
     */
    public static String mirroredString(String s) {
        return s + mirroredString(s, 0);
    }

    private static String mirroredString(String s, int index) {
        if (index == s.length())
            return "";
        if (s.charAt(index) == '(') {
            return mirroredString(s, index + 1)+")";
        }
        return  mirroredString(s, index + 1)+s.charAt(index);
    }

    /*
    17 .Given a string containing only small English letters. Form a new line
    by "cutting" identical letters located at symmetrical places (that is, if there
    are 2 identical letters at the same distance from the center of the line,
    then they must be removed from the line). If the length of the string is
    odd, then the middle letter does not need to be shortened.
     */
    public static String cutSymmetric(String s) {
        if (s.length()==1)
            return s;
        if(s.charAt(0)==s.charAt(s.length()-1)) {
            return cutSymmetric(s.substring(1, s.length() - 1));
        }
        return s.charAt(0)+cutSymmetric(s.substring(1,s.length()-1))+s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(cutSymmetric("ahgjghs"));
    }
}
