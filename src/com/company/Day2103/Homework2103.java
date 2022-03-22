package com.company.Day2103;

import java.util.*;

public class Homework2103 {
    public static void main(String[] args) {

        System.out.println(longest("abcdbefjhb"));
    }

    /*1. Write a method which will check if the given array of
    integers contains duplicate elements
     */
    public static boolean checkDuplicate(int[] array) {
        Set<Integer> arraySet = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!arraySet.add(array[i]))
                return true;
        }
        return false;
    }

    /*
    2.Write a method which prints elements that  occurred only
once in the array.
     */
    public static void printNonDuplicates(int[] array) {
        Set<Integer> arraySet = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();
        for (int i : array) {
            if (!arraySet.add(i)) {
                duplicates.add(i);
            }

        }
        for (int i : duplicates) {
            arraySet.remove(i);
        }
        Object[] result = arraySet.toArray();
        for (Object o : result) {
            System.out.println(o);
        }
    }

    /*
    3.Write a method that counts duplicate characters from a
given string.
     */
    public static int duplicateChar(String s) {

        int count = 0;
        Set<Character> characterSet = new HashSet<>();
        Set<Character> duplicateCharSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!characterSet.add(s.charAt(i)) && !duplicateCharSet.contains(s.charAt(i))) {
                count++;
                duplicateCharSet.add(s.charAt(i));
            }
        }
        return count;
    }
    /*
    4.Write a method that returns the first non-repeated
character from a given string
     */

    public static char firstNonRepeat(String s) {

        Set<Character> characterSet = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!characterSet.add(s.charAt(i))) {
                duplicate.add(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!duplicate.contains(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    /*
    5.Write a method which will return the length of the longest
substring without repeating characters.
“abba” – 2, “abcdaefjh” – 8
     */
    public static int longest(String s) {

        Set<String> nonRepeatStrings = new HashSet<>();
        Set<Character> stringElements = new HashSet<>();
        int start = 0;
        while (start < s.length()) {
            for (int i = start; i < s.length(); i++) {
                if (!stringElements.add(s.charAt(i))) {
                    nonRepeatStrings.add(s.substring(start, i));
                    start++;
                    stringElements.clear();
                    break;
                }
                if (i == s.length() - 1) {
                    nonRepeatStrings.add(s.substring(start));
                    start++;
                    stringElements.clear();
                }
            }

        }


        int max=0;
        for (String nonRepeatString : nonRepeatStrings) {
            if(nonRepeatString.length()>max){
                max=nonRepeatString.length();
            }
        }

        return max;
    }
}

