package com.java.day12.stack;

import java.util.EmptyStackException;

class Stack<T> {
    private static int size = 0;
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        size--;
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        Node<T> t = new Node<T>(item);
        size++;
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
