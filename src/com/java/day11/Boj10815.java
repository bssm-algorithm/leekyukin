package com.java.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj10815 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = strToInt(bf.readLine());

        Set<String> mine = new HashSet<>();
        StringTokenizer mySt = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            mine.add(mySt.nextToken());
        }

        int M = strToInt(bf.readLine());
        List<String> sangs = new ArrayList<>();
        StringTokenizer sangSt = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < M; i++) {
            sangs.add(sangSt.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(mine.contains(sangs.get(i))) {
                sb.append("1");
            }
            else {
                sb.append("0");
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
