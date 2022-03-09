package com.company.Day0903;

public class StackMain {
    public static void main(String[] args) {
        DefaultStack stack=new DefaultStack();
       // stack.pop();
        stack.push(5);
        stack.push(4);
        stack.push(5);
        stack.push(4);
        stack.push(17);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(8);
      //  stack.push(9);
        System.out.println(stack.pop());

    }
}
