package com.java.firstTry.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = br.readLine();
        }

        int cnt = 0;
        for (int i = 0; i < N-1; i++) {
            cnt += names[i].compareTo(names[i+1]) > 0 ? 1 : -1;
        }

        if (cnt == N-1)
            System.out.println("DECREASING");
        else  if (cnt == 1-N)
            System.out.println("INCREASING");
        else
            System.out.println("NEITHER");

    }
}
