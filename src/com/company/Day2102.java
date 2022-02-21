package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Day2102 {

    // 1.Write a function which returns the length of a given String.

    public static int length(String s) {
        return s.length();
    }

    /*2.Write a function which returns a character of a given index,from a given String.
    Pass as a parameters String str, int index
    */
    public static char getSymbol(String s, int index) {
        return s.charAt(index);
    }

    /*
    3.Write a function which checks if the given String contains a given character.Pass as parameters
   String str, char ch
     */
    public static boolean isContain(String str, Character ch) {

        boolean isContain = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                isContain = true;
        }
        return isContain;

    }

    // 4.Write a function which returns the count of vowels of a given String

    public static int countOfVowels(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
            }
        }
        return vowelCount;
    }

    /*
    5.Write a function called reverseString, which prompts the user for a String, and prints the
    reverse of the String by extracting and processing each character. The output shall look like:
    Enter a String: abcdef
    The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
     */
    public static String reverse(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }

    /*
    6.Write a program called countVowelsDigits, which get as parameter a String, counts the
number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
the counts and the percentages (rounded to 2 decimal places).
     */
    public static void countVowelsDigits(String str) {
        int vowelCount = countOfVowels(str);
        int digitCount = countOfDigits(str);
        double vowelPercent = (double) vowelCount * 100 / str.length();
        double digitPercent = (double) digitCount * 100 / str.length();
        System.out.printf("Number of vowels: %d, (%f)", vowelCount, vowelPercent);
        System.out.println();
        System.out.printf("Number of digits: %d,(%f)", digitCount, digitPercent);
    }

    public static int countOfDigits(String str) {
        int countOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                countOfDigits++;
            }
        }
        return countOfDigits;
    }

    /*
    7.Caesar's Code is one of the simplest encryption techniques. Each letter in the plaintext is
    replaced by a letter with some fixed number of positions (n) down the alphabet cyclically. In this
    exercise, we shall pick n=3. That is, 'A' is replaced by 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by
    'A', ..., 'Z' by 'C'.
     */
    public static void caesarCode(String str, int n) {
        String output = "";
        String input = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) <= 122 - n) {
                output += (char) (input.charAt(i) + n);
            } else {
                int dif = n - (122 - input.charAt(i) + 1);
                output += (char) (97 + dif);
                // output+=(char)(97+n);
            }
        }
        System.out.println(output.toUpperCase(Locale.ROOT));
    }


    /*
    8.Write a function to check if the passed String palindrome or not
     */
    public static boolean isPalindrome(String s) {
        String str = reverse(s);
        return str.toUpperCase(Locale.ROOT).equals(s.toUpperCase(Locale.ROOT));
    }

    /*
    9.The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr to
    verify a binary string. The program shall prompt the user for a binary string; and decide if the input
    string is a valid binary string.
     */
    public static boolean isBinary(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == '0' || s.charAt(i) == '1')) {
                return false;
            }
        }
        return true;
    }

    /*
    10.The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f). Write a
program to verify a hex string. The function gets a hex string; and decides if the input string is a
valid hex string.
     */
    public static boolean isHexNumber(String str) {
        String sDigits = "0123456789";
        String sAtoF = "ABCDEF";
        for (int i = 0; i < str.length(); i++) {
            if (!(isContain(sDigits, str.charAt(i)) || isContain(sAtoF, str.charAt(i)) ||
                    isContain(sAtoF.toLowerCase(Locale.ROOT), str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /*
    11.Write a function called bin2Dec to convert an input binary string into its equivalent decimal
number.
     */
    public static int bin2Dec(String str) {
        int number = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            number += (str.charAt(i) == '1' ? 1 : 0) * Math.pow(2, i);
        }
        return number;
    }

    /*
    12.Write a function that counts duplicate characters from a given string.
     */
    public static int countDuplicates(String str) {
        String alreadyComparing = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !isContain(alreadyComparing, str.charAt(i))) {
                    count++;
                    alreadyComparing += str.charAt(i);
                }
            }
        }
        return count;
    }

/*
13.Write a function that returns the first non-repeated character from a given string.
 */

    public static String firstNonRepeat(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isContain(str.substring(0, i), str.charAt(i)) && !isContain(str.substring(i + 1), str.charAt(i))) {
                return str.charAt(i) + "";
            }
        }
        return "";
    }

    /*
    14.Write a function that counts occurrences of a certain character in a given string.
     */
    public static int occurrenceCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bin2Dec("101"));
    }
}
