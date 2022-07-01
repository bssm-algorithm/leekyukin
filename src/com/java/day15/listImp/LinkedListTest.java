package com.java.day15.listImp;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.printAll();
        list.add(2);
        list.printAll();
        list.add(3);
        list.printAll();
        list.add(4);
        list.printAll();

        list.remove(4);
        list.printAll();

        list.remove(3);
        list.printAll();

        list.remove(2);
        list.printAll();

        list.remove(1);
        list.printAll();
    }
}
