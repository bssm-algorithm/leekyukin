package com.java.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Boj1931 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = strToInt(bf.readLine());

        int[][] meeting = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            meeting[i][0] = strToInt(st.nextToken());
            meeting[i][1] = strToInt(st.nextToken());
        }

        Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });

        int cnt = 1;
        int j = 0;
        for (int i = j+1; i < N; i++) {
            if (meeting[j][1] <= meeting[i][0]) {
                j = i;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
