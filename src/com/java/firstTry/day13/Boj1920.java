package com.java.firstTry.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1920 {

    static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = toInt(bf.readLine());
        Set<String> set = new HashSet<>();
        StringTokenizer st1 = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            set.add(st1.nextToken());
        }

        int M = toInt(bf.readLine());
        List<String> list = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < M; i++) {
            list.add(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            if (set.contains(list.get(i))) {
                sb.append(1);
            }
            else {
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
