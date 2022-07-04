package com.java.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int c = br.readLine().charAt(0)-97;
            arr[c]++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                System.out.print((char)(i+97));
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("PREDAJA");
        }
    }
}
