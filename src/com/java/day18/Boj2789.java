package com.java.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

       // CAMBRIDGE
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'C'
                    || c == 'A'
                    || c == 'M'
                    || c == 'B'
                    || c == 'R'
                    || c == 'I'
                    || c == 'D'
                    || c == 'G'
                    || c == 'E'
            ) continue;
            sb.append(c);
        }

        System.out.println(sb);
    }
}
