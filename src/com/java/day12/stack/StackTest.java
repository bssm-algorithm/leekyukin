package com.java.day12.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);

        System.out.println("Size : " + stack.size());
        stack.pop();
        System.out.println("Size : " + stack.size());
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}
