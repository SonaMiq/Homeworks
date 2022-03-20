package com.company.Day1603;

import java.util.Iterator;

public class LinkedList implements List {

    private int size;

    private static class Node {
         int val;
         Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    private Node head;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }
        Node top = head;
        while (top.next != null)
            top = top.next;
        top.next = new Node(val, null);
        size++;

    }

    @Override
    public int get(int index) {
        if (index>=size)
            throw new IndexOutOfBoundsException();
        Node top = head;
        for (int i = 0; i < index; i++) {
            top = top.next;
        }
        return top.val;
    }

    @Override
    public void add(int index, int val) {
        if (index>=size)
            throw new IndexOutOfBoundsException();
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }

        if (index == 0) {
            head = new Node(val, head);
            size++;
            return;
        }
        Node top = head;
        for (int i = 0; i < index - 1; i++) {
            top = top.next;
        }
        top.next = new Node(val, top.next);
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index) {
        if (index>=size)
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.get(i) + "->");
        }
        s.append(this.get(size - 1));
        return s.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {

          private  Node node=head;
          private  int index;

            @Override
            public boolean hasNext() {
                return index<size;
            }

        @Override
        public Integer next() {
            Integer value =  node.val;
                node=node.next;
                index++;
            return value;
        }
    }
    }



