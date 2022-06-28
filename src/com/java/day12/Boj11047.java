package com.java.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11047 {
    static int toInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = toInt(st.nextToken());
        int money = toInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = toInt(bf.readLine());
        }

        int count = 0;
        for (int i = N-1; i >= 0; i--) {

            if (coins[i] <= money) {
                count += money / coins[i];
                money = money % coins[i];
            }
        }

        System.out.println(count);
    }
}
