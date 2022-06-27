package com.java.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj11478 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine();

        String[] arr = S.split("");

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sb.append(arr[j]);
                set.add(String.valueOf(sb));
            }
            sb.setLength(0);
        }

        System.out.println(set.size());
    }
}
