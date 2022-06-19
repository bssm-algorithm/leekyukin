package com.java.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Boj2108 {
    static int val = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] list = new int[N];
        for (int i = 0 ; i < N; i++)
            list[i] = Integer.parseInt(bf.readLine());

        int sum = Arrays.stream(list).sum();

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length - 1];
        int midIndex = (list.length - 1) / 2;

        System.out.println(sum / list.length);
        System.out.println(list[midIndex]);
        // todo : 최빈값 구하기
        System.out.println();
        System.out.println(max - min);
    }
}