package com.java.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10828 {
    static class Stack {
        private int size = 0;

        static class Node {
            private final int data;
            private Node next;

            Node(int n) {
                data = n;
                next = null;
            }
        }

        private Node top;

        void push(int n) {
            size++;
            Node node = new Node(n);
            node.next = top;
            top = node;
        }

        int pop() {
            if (size == 0) {
                return -1;
            }
            size--;
            Node item = top;
            top = top.next;
            return item.data;
        }

        int size() {
            return size;
        }

        int top() {
            if (top != null) {
                return top.data;
            }
            return -1;
        }

        int empty() {
            return top == null ? 1 : 0;
        }
    }

    static int toInt(String str) {
        return Integer.parseInt(str);
    }

    static void switchLogic(String bf, Stack stack) {
        StringTokenizer st = new StringTokenizer(bf, " ");

        String logic = st.nextToken();
        Integer data = st.hasMoreTokens() ? toInt(st.nextToken()) : null;
        switch (logic) {
            case "push":
                stack.push(data);
                break;
            case "pop":
                System.out.println(stack.pop());
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "empty":
                System.out.println(stack.empty());
                break;
            case "top":
                System.out.println(stack.top());
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = toInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String input = bf.readLine();
            switchLogic(input, stack);
        }

    }
}
