package com.java.day15.linkedList;

public class LinkedList<T> {
    private int size = 0;

    class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    public void add(T data) {
        size++;
        Node<T> end = new Node<T>(data);

        if (head == null) {
            head = end;
        }
        else {
            Node<T> tmp = head;

            while(tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = end;
        }
    }

    public void remove(T data) {
        Node<T> tmp = head;

        int before = size;

        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.data == data) {
            head = head.next;
        }
        else {
            while(tmp.next != null) {
                if(tmp.next.data == data) {
                    size--;
                    tmp.next = tmp.next.next;
                    break;
                }
                else {
                    tmp = tmp.next;
                }
            }
            if (size == before ) {
                System.out.println("no " + data + " in this list!");
            }
        }
    }

    public void printAll() {

        if (head == null) {
            System.out.println("List is empty!");
        }
        else {
            Node<T> tmp = head;

            while(tmp != null) {
                System.out.print(tmp.data);
                tmp = tmp.next;

                if (tmp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
