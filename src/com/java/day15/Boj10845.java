package com.java.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10845 {
    public static class Queue {
        private int size = 0;

        class Node {
            private int data;
            private Node next;

            private Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node front;
        private Node rear;

        public void push(int data) {
            Node newNode = new Node(data);

            size++;
            if (front == null) {
                front = newNode;
                rear = newNode;
            }
            else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int pop() {
            int before = size;
            Node res;
            if (empty() == 1) {
                return -1;
            }
            else {
                res = front;
                size--;
                front = front.next;
            }
            return res.data;
        }

        public int size() {
            return size;
        }

        public int empty() {
            return front == null ? 1 : 0;
        }

        public int front() {
            if(empty() == 1) {
                return -1;
            }
            return front.data;
        }

        public int back() {
            if(empty() == 1) {
                return -1;
            }
            return rear.data;
        }

    }

    static void switchLogic(String bf, Queue queue) {
        StringTokenizer st = new StringTokenizer(bf, " ");

        String logic = st.nextToken();
        Integer data = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : null;
        switch (logic) {
            case "push":
                queue.push(data);
                break;
            case "pop":
                System.out.println(queue.pop());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                System.out.println(queue.empty());
                break;
            case "front":
                System.out.println(queue.front());
                break;
            case "back":
                System.out.println(queue.back());
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Queue queue = new Queue();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String input = bf.readLine();
            switchLogic(input, queue);
        }

    }
}
