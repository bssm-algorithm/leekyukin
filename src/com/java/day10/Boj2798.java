package com.java.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        StringTokenizer stList = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stList.nextToken()));
        }
        int max = 0;
        int[] selectedCards = new int[3];
        for (int i = 0; i < N; i++) {
            selectedCards[0] = list.get(i);

            for (int j = i+1; j < N; j++) {
                selectedCards[1] = list.get(j);

                for(int k = j+1; k < N; k++) {
                    selectedCards[2] = list.get(k);

                    int sum = selectedCards[0] + selectedCards[1] + selectedCards[2];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
