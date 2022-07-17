package com.java.firstTry.day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i % 10 == 9) sb.append("\n");
        }
        System.out.println(sb);
    }
}
