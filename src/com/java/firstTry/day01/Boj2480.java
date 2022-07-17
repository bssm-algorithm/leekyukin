package com.java.firstTry.day01;

import java.util.Scanner;

public class Boj2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int same = 0;
        int cnt = 0;
        int max = 0;
        int[] arr = new int[3];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = scan.nextInt();
        }

        for(i = 0; i < arr.length - 1; ++i) {
            max = Math.max(arr[i], max);

            for(int j = 1; j < arr.length; ++j) {
                if (i != j && arr[i] == arr[j]) {
                    same = arr[i];
                    ++cnt;
                }
            }
        }

        i = cnt == 0 ? max * 100 : (cnt == 1 ? 1000 + same * 100 : (cnt == 3 ? 10000 + same * 1000 : 0));
        System.out.println(i);
    }
}
