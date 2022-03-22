package com.company.Day2003;

import com.company.Day1603.List;

import java.util.Iterator;

public class ArrayList implements List {

    int capacity = 16;
    int[] array = new int[capacity];
    private int size = 0;

    @Override
    public void add(int val) {
        if (size >= capacity) {
            grow();
        }
        array[size] = val;
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index == size) {
            add(val);
            return;
        }

        grow(index, val);
        size++;
    }

    private void grow() {
        capacity = 2 * capacity;
        int[] copyArray = array.clone();
        array = new int[capacity];
        for (int i = 0; i < size; i++) {
            array[i] = copyArray[i];
        }
    }

    private void grow(int index, int val) {
        int[] copyArray = array.clone();
        if (index >= capacity) {
            capacity = 2 * capacity;
            array = new int[capacity];
        }
        for (int i = 0; i < index; i++) {
            array[i] = copyArray[i];
        }
        array[index] = val;
        for (int i = index ; i < size; i++) {
            array[i+1] = copyArray[i];
        }
    }

    @Override
    public void delete(int index) {
        if (index >=size)
            throw new IndexOutOfBoundsException();
        int[] copyArray = array.clone();
        for (int i = 0; i < index; i++) {
            array[i] = copyArray[i];
        }
        for (int i = index; i < size-1; i++) {
            array[i] = copyArray[i +1];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Integer next() {
            int out = array[index];
            index++;
            return out;
        }
    }
}
