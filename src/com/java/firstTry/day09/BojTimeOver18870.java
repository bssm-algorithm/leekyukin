package com.java.firstTry.day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BojTimeOver18870 {
    static int inputInt(BufferedReader bf) throws IOException {
        return Integer.parseInt(bf.readLine());
    }
    static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = inputInt(bf);

        List<Integer> origin = new ArrayList<>();

        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        for(int i = 0; i < N; i++) {
            origin.add(toInt(st.nextToken()));
        }

        int[] sorted = origin.stream()
                .sorted()
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();

        List<Integer> result = new ArrayList<>();
        for (int l : origin) {
            for (int i = 0; i < sorted.length; i++) {
                if(l == sorted[i])
                    result.add(i);
            }
        }

        result.forEach(n -> sb.append(n).append(" "));
        System.out.println(sb);
    }
}
