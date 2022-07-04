package com.java.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 10; i < 36; i++) {
                map.put((char) (i + 55), i);
        }

        int decide = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(N.length()-(i+1));
            if (65 <= c) {
                decide += map.get(c) * Math.pow(B, i);
            }
            else {
                decide += Integer.parseInt(String.valueOf(c)) * Math.pow(B, i);
            }
        }

        System.out.println(decide);

    }
}
