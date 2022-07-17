package com.java.firstTry.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11399 {
    static int toInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = toInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(toInt(st.nextToken()));
        }

        Collections.sort(list);

        int sum = 0;
        int val = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += val + list.get(i);
            val += list.get(i);
        }

        System.out.println(sum);
    }
}
