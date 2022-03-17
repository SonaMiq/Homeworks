package com.company.Day1603;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(20);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.delete(0);
        for (int i:linkedList) {
            System.out.println(i);
        }




    }
}

