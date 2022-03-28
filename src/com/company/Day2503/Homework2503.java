package com.company.Day2503;

import java.util.*;

public class Homework2503<T> {
    /*
    1. Write a method which takes a list of any type and prints the elements of the list.
     */
    public static void print() {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(12);
        list.add(7);
        list.add(3);
        list.add(51);

        for (int i : list) {
            System.out.println(i);
        }
    }

    /*
    2. Write a method that takes an array of T type and converts it to a list of type T.
     */
    public List toList(T[] array) {
        List<T> list = Arrays.asList(array);
        return list;
    }

/*
4. Define a method copy(dest, src) which will copy from src to dest. src
and dest are lists. (use wildcards for this problem)
Method should work for this example`
List<Number> nums;
List<Integer> ints;
copy(nums, ints);
But not for this` copy(ints, nums);
 */

    public static void copy(List<Number> dest,List<? extends Number> src){
        dest.clear();
        for (Number a:src ) {
            dest.add(a);
        }
    }


    public static void main(String[] args) {

    }
}