package com.java.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), "-");

        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            sb.append(st.nextToken().charAt(0));
        }

        System.out.println(sb);
    }
}
