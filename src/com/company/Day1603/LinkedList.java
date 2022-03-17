package com.company.Day1603;

import java.util.Iterator;

public class LinkedList implements List {

    private static LinkedList linkedList;
    private int size;

    private static class Node {
        private int val;
        private Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node head;

    LinkedList() {
        linkedList = this;
    }

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
            size++;
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
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index) {
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
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < linkedList.size();
            }

            @Override
            public Integer next() {

                int out = linkedList.get(index);
                index++;
                return out;
            }
        };
    }


}
