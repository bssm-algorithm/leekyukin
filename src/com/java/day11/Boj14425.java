package com.java.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj14425 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(bf.readLine(), " ");

        int N = strToInt(input.nextToken());
        int M = strToInt(input.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(bf.readLine());
        }

        int cnt = 0;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if(set.contains(bf.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
