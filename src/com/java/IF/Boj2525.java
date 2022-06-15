package com.java.IF;

import java.util.Scanner;

public class Boj2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int time = scan.nextInt();
        if (m + time >= 60) {
            h += (m + time) / 60;
            m = (m + time) % 60;
        } else {
            m += time;
        }

        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
