package com.java.firstTry.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BojTimeOver1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = bf.readLine();

        StringTokenizer st = new StringTokenizer(N, " ");

        int djN = Integer.parseInt(st.nextToken());
        int bjN = Integer.parseInt(st.nextToken());

        List<String> dj = new ArrayList<>();
        List<String> bj = new ArrayList<>();

        for (int i = 0; i < djN; i++) {
            dj.add(bf.readLine());
        }
        for (int i = 0; i < bjN; i++) {
           bj.add(bf.readLine());
        }

        int number = 0;
        for (String d : dj) {
            for (String b : bj) {
                if(d.equals(b)) {
                    number++;
                    sb.append(d).append("\n");
                }
            }
        }

        System.out.println(number + "\n" + sb);
    }
}
