package com.java.firstTry.day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2108 {
    static int inputInt(BufferedReader bf) throws IOException {
        return Integer.parseInt(bf.readLine());
    }
    static int toInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = inputInt(bf);

        int[] cnt = new int[8001];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int n = inputInt(bf);
            list.add(n);
            cnt[n + 4000]++;
        }

        Collections.sort(list);

        int size = list.size();
        int min = list.get(0);
        int max = list.get(size-1);
        int range = max - min;
        int mid = list.get((size-1) / 2);
        int sum = list.stream().mapToInt(n -> n).sum();
        int average = Math.round((float) sum / size);

        int mode = 0;
        int cntMax = 0;
        int numberCnt = 0;
        for(int i = 0; i < 8001; i++) {
            cntMax = Math.max(cntMax, cnt[i]);
        }

        List<Integer> cntList = new ArrayList<>();
        for(int i = 0; i < 8001; i++) {
            if (cnt[i] == cntMax) {
                cntList.add(i - 4000);
            }
        }

        if(cntList.size() > 1) {
            mode = cntList.get(1);
        }
        else {
            mode = cntList.get(0);
        }

        System.out.println(average);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}
