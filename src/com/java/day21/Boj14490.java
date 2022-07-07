package com.java.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int min = Math.min(n1, n2);

        int result = 0;
        for (int i = 2; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                result = i;
        }

        if (result == 0) {
            System.out.println(n1 + ":" + n2);
        }
        else {
            System.out.println((n1 / result) + ":" + (n2 / result));
        }
    }
}
