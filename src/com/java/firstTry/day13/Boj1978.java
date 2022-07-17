package com.java.firstTry.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 2; j <= num; j++) {
                if (num % j == 0)
                    cnt++;
            }
            if (cnt == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
