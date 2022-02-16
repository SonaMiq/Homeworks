package com.company.Day1602;

import java.util.Arrays;
import java.util.Random;

public class Homework1602 {
    /*
    1.Print all elements of the array with even indices (that is, A [0], A
[2], A [4]...)
- Input natural integer N
- define an array with size N,
- Initialize it
Example ` Input` 1 2 3 4 5
Output` 1 3 5
     */
    public static void evenIndex(int size) {
        int[] array = generateArray(size);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                System.out.print(array[i] + " ");
        }
    }

    /*
    2. Print all even numbered items in the list.
    - Input natural integer N
    - define an array with size N,
    - Initialize it
    Example ` Input` 1 2 3 4 5 10
    Output` 2 4 10
     */
    public static void evenNumbers(int n) {
        int[] array = generateArray(n);
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /*
    3. Find the number of positive elements in the given array.
Example` Input` 1 -1 2 3 -8
Output 1 2 3
     */
    public static int positiveCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    /*
    4. A list of numbers is given. Print all the elements of the list that are
larger than the previous element.
Example` Input ` 1 5 2 4 3 Output` 5 4
     */
    public static void largeThanPreviousElements(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1])
                System.out.print(input[i] + " ");
        }
    }

    /*
    5. An array of numbers is given. If it has two adjacent(հարևան)
    elements of the same sign, print these numbers. If there are no
    adjacent elements of the same character, do not print anything. If there
    are several such pairs of neighbors, print the first pair.
    Example` Input` -1 2 3 -1 -2
    Output` 2 3
     */
    public static void adjacent(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if((array[i]>0&&array[i+1]>0)||(array[i]<0&&array[i+1]<0)){
                System.out.println(array[i]+", "+array[i+1]);
                return;
            }
        }
    }

    /*
    6. An array of numbers is given. Print the value of the largest element in
the array, and then the index of that element in the array. If there are
several largest elements, print the index of the first of them.
Example` Input` 1 2 3 2 1
Output` The largest is 3 index is 2
     */
    public static void printMaxAndIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("max: " + max + " index: " + index);
    }

    /*
    7.Print the value of the smallest of all positive elements in the list. It is
    known that the list contains at least one positive element, and the
    absolute value of all elements of the list does not exceed 1000.
    Example ` Input ` 5 -4 3 -2 1
    Output ` 1
     */
    public static void minPositive(int[] array) {
        int minPos = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minPos) {
                minPos = array[i];
            }
        }
        System.out.println(minPos);
    }

    /*
    8.You are given a list sorted by non-decreasing elements in it. Determine
how many different elements are in it.
Example ` Input ` 1 2 2 3 3 3
Output ` 3
     */
    public static int differentEl(int[] array) {
        int differentCount = 0;
        int[] arr = Arrays.stream(array).sorted().toArray();
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                differentCount++;
            }
        }
        return differentCount == 0 ? 0 : differentCount + 1;

    }

    /*
    9.Print the elements of the given list in reverse order without changing
the list itself.
Example ` Input ` 1 2 3 4 5
Output ` 5 4 3 2 1
     */
    public static void reversePrint(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /*
    10.Rearrange the elements of this array in reverse order, then print the
    elements of the resulting array.
    This task differs from the previous one in that you need to change the
    values of the elements of the array itself, swapping A[0] with A[n-1], A[1] with A[n-2], and then display
    the elements of the array in a row.
    Example ` Input ` 1 2 3 4 5
    Output ` 5 4 3 2 1
     */
    public static int[] reverseArray(int[] array) {
        int current = 0;
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            current = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = current;
        }
        return array;
    }

    /*
    11. Rearrange the adjacent elements of the array (A [0] with A [1], A [2]
with A [3], etc.). If there is an odd number of elements, then the last
element remains in its place.

Example ` Input ` 1 2 3 4 5
Output ` 2 1 4 3 5
     */
    public static int[] rearrange(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            array[i] = array[i] + array[i + 1];
            array[i + 1] = array[i] - array[i + 1];
            array[i] = array[i] - array[i + 1];
        }
        return array;
    }



    /*
    12.Cycle the elements of the array to the right (A [0] goes to A [1], A [1]
    to A [2], ..., the last element goes to A [0]).
    Example ` Input ` 1 2 3 4 5
    Output ` 5 1 2 3 4
     */
    public static int[] cycle(int[] array) {
        int current = 0;
        int next = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            current = next;
            next = array[i + 1];
            array[i + 1] = current;
        }
        array[0] = next;
        return array;
    }

    /*
    13.In the list, all items are different. Swap the minimum and maximum
elements of this list.
Example ` Input ` 3 2 1 4 5
Output ` 3 2 5 4 1
     */
    public static int[] swapMinMax(int[] array) {
        int indexMax = indexOfMax(array);
        int indexMin = indexOfMin(array);
        array[indexMax] = array[indexMax] + array[indexMin];
        array[indexMin] = array[indexMax] - array[indexMin];
        array[indexMax] = array[indexMax] - array[indexMin];
        return array;
    }

    public static int indexOfMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfMin(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    /*
    14.You are given an array of numbers and the index of an element in the
    array. Index is k. Remove the element with index k from the list by
    moving all elements to the right of the element with index k to the left.
    The program should shift directly in the array, and not do it when
    displaying elements. Also, you cannot use an additional array.
    At least decrement size of array, and print array;
    Example` Input` 1 2 3 4 5    2  Output` 1 2 4 5
     */
    public static void remove(int[] array, int k) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i >= k) {
                array[i] = array[i + 1];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }

    }
    /*
    15.A list is given. Print those elements of it that appear in the list
only once. Items should be displayed in the order in which they
appear in the list.
Example` Input ` 1 2 2 3 3 3
Output ` 1
     */


    /*
    16.An array of integers is given. It is required to “compress” it by moving
all non-zero elements to the left side of the array without changing their
order, and all zeros to the right side. The order of nonzero elements
cannot be changed, an additional list cannot be used, the task must be
completed in one pass through the array. Print the resulting array.
Example` Input ` 1 0 3 0 5
Output ` 1 3 5 0 0
     */
    public static int[] compress(int[] array) {
        int zeroCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] != 0) {
                array[i - zeroCount] = array[i + 1];
                array[i + 1] = 0;
                continue;
            }
            if (array[i] == 0 && array[i + 1] == 0) {
                zeroCount++;
                continue;
            }
        }
        return array;
    }

    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20)-10;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = generateArray(10);
        printArray(arr);
        adjacent(arr);
    }

}
