package com.java.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                sum += 10;
            }
            else if (str.charAt(i-1) == str.charAt(i)) {
                sum += 5;
            }
            else {
                sum += 10;
            }
        }

        System.out.println(sum);
    }
}
