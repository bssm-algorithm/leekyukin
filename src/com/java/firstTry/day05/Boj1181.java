package com.java.firstTry.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Boj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < arr.length; i++)
            arr[i] = bf.readLine();

        Arrays.stream(arr)
                .sorted()
                .sorted(Comparator.comparing(String::length))
                .distinct()
                .forEach(System.out::println);
    }
}
