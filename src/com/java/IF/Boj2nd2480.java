package com.java.IF;

import java.util.Scanner;

public class Boj2nd2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && a == c && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a != b && a != c) {
            if (b == c) {
                System.out.println(1000 + b * 100);
            } else {
                System.out.println(Math.max(a, Math.max(b, c)) * 100);
            }
        } else {
            System.out.println(1000 + a * 100);
        }

    }
}
