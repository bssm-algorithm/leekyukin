package com.java.firstTry.day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2108 {
    static int mode = 0;
    static int minusMax = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] list = new int[N];
        for (int i = 0 ; i < N; i++)
            list[i] = Integer.parseInt(bf.readLine());

        int sum = Arrays.stream(list).sum();

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length-1];
        System.out.println(min + " " + max);
        int midIndex = (list.length - 1) / 2;

        Arrays.stream(list).filter(n -> n<0).map(n -> -1*n).forEach(n -> minusMax = Math.max(n, minusMax));
        int[] minusArr = Arrays.stream(list).filter(n -> n < 0).map(Math::abs).sorted().toArray();
        int[] plusArr = Arrays.stream(list).filter(n -> n > 0).toArray();

        int[] plus = new int[max];
        int[] minus = new int[minusMax];

        Arrays.stream(plusArr).forEach(n -> plus[n]++);
        Arrays.stream(minusArr).forEach(n -> minus[n]++);

        Arrays.stream(plus).forEach(n -> mode = Math.max(mode, n));
        Arrays.stream(minus).forEach(n -> mode = Math.max(mode, n));

        int modeIndex = 0;
        for(int i = 0; i < 4000; i++) {
            if (mode == plus[i]) modeIndex = i;
            else if (mode == minus[i]) modeIndex = (-1 * i);
        }

        System.out.println(sum / list.length);
        System.out.println(list[midIndex]);
        // todo : 최빈값 구하기
        System.out.println(modeIndex);
        System.out.println(max - min);
    }
}
