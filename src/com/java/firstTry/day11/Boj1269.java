package com.java.firstTry.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1269 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(bf.readLine(), " ");

        int N = strToInt(input.nextToken());
        int M = strToInt(input.nextToken());

        Set<Integer> A = new HashSet<>();
        StringTokenizer getA = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A.add(strToInt(getA.nextToken()));
        }

        Set<Integer> B = new HashSet<>();
        StringTokenizer getB = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < M; i++) {
            B.add(strToInt(getB.nextToken()));
        }
        Set<Integer> copyA = new HashSet<>(A);

        A.removeAll(B);
        B.removeAll(copyA);
        List<Integer> result = new ArrayList<>();
        result.addAll(A);
        result.addAll(B);

        System.out.println(result.size());
    }
}
