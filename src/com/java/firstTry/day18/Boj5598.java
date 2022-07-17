package com.java.firstTry.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = bf.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'C')
                c += 23;
            else
                c -= 3;
            sb.append(c);
        }

        System.out.println(sb);
    }
}
