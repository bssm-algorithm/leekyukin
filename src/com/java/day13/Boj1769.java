package com.java.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boj1769 {
    static int count = 0;
    static int[] func(int[] arr) {
        if (arr.length == 1) return arr;
        count++;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        String str = String.valueOf(sum);
        int[] next = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        return func(next);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String X = bf.readLine();

        int[] arr = Arrays.stream(X.split("")).mapToInt(Integer::parseInt).toArray();

        String answer = func(arr)[0] % 3 == 0 ? "YES" : "NO";
        System.out.println(count);
        System.out.println(answer);
    }
}
