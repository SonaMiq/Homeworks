package com.company.Day1603;

public class LinkedList implements List {

    private int size;

    private static class Node {
        private int val;
        private Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;

    @Override
    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    @Override
    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            return;
        }
        Node top = head;
        while (top.next != null)
            top = top.next;
        top.next = new Node(val, null);

    }

    @Override
    public int get(int index) {
        Node top = head;
        for (int i = 0; i < index; i++) {
            top = top.next;
        }
        return top.val;
    }

    @Override
    public void add(int index, int val) {
        if (head == null) {
            head = new Node(val, null);
            return;
        }

        if (index == 0) {
            head = new Node(val, head);
            return;
        }
        Node top = head;
        for (int i = 0; i < index - 1; i++) {
            top = top.next;
        }
        top.next = new Node(val, top.next);


    }

    @Override
    public int size() {
        if (head == null)
            return 0;
        Node node = head;
        int size = 1;
        while (node.next != null) {
            node = node.next;
            size++;
        }

        return size;
    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
    }
}
