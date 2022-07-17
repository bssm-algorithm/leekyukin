package com.java.firstTry.day15.queueImp;

public class Queue<T> {
    private int size = 0;

    class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

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

    public void pop() {
        int before = size;

        if (empty()) {
            System.out.println("Queue is empty!");
        }
        else {
            size--;
            front = front.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return front == null;
    }

    public T front() {
        if(empty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return front.data;
    }

    public T back() {
        if(empty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return rear.data;
    }

    public void printAll() {
        Node<T> tmp = front;

        if (empty()) {
            System.out.println("Queue is empty!");
        }
        else {
            do {
                System.out.print(tmp.data);
                tmp = tmp.next;

                if(tmp != null) {
                    System.out.print(" -> ");
                }
            }
            while(tmp != null);
            System.out.println();
        }
    }
}
