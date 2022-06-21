package com.java.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = bf.readLine();

        int[] alphabets = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabets[s.charAt(i)-97]++;

        Arrays.stream(alphabets).forEach(n -> sb.append(n).append(' '));
        System.out.println(sb);
    }
}
