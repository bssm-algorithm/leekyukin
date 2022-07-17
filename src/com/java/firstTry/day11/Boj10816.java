package com.java.firstTry.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj10816 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = strToInt(bf.readLine());
        List<String> list = new ArrayList<>();
        StringTokenizer first = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(first.nextToken());
        }

        int M = strToInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer second = new StringTokenizer(bf.readLine(), " ");
        String[] keys = new String[M];
        for (int i = 0; i < M; i++) {
            String key = second.nextToken();
            keys[i] = key;
            map.put(key, 0);
        }

        for (int i = 0; i < N; i++) {
            String key = list.get(i);
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }
        }

        for (String key : keys) {
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);
    }
}
