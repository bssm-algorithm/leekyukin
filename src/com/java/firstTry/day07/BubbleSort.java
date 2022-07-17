package com.java.firstTry.day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(bf.readLine());

        for(int i = N-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]).append('\n');

        System.out.println(sb);
    }
}
