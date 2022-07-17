package com.java.firstTry.day15.queueImp;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(1);
        queue.printAll();

        queue.push(2);
        queue.printAll();

        queue.push(3);
        queue.printAll();

        queue.pop();
        queue.printAll();

        queue.pop();
        queue.printAll();

        queue.pop();
        queue.printAll();
    }
}
