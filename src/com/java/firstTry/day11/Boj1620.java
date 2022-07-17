package com.java.firstTry.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1620 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    static boolean isString(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = strToInt(st.nextToken());
        int M = strToInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        for (int i = 0; i < N; i++) {
            String mon = bf.readLine();
            map.put(mon, i + 1);
            arr[i + 1] = mon;
        }

        for(int i = 0; i < M; i++) {
            String mon = bf.readLine();
            if (isString(mon)) {
                System.out.println(map.get(mon));
            }
            else {
                int intMon = Integer.parseInt(mon);
                System.out.println(arr[intMon]);
            }
        }
    }
}
