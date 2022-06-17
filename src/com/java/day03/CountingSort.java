package com.java.day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        int[] count = new int[1000000000];
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            max = Math.max(max, arr[i]);
        }

        for(int n : arr) count[n]++;

        for(int i = 0; i <= max; i++) {
            for(int j = 0; j < count[i]; j++)
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
