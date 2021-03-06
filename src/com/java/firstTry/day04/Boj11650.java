package com.java.firstTry.day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11650 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (arr1, arr2) -> {

            if (arr1[0] == arr2[0])
                return arr1[1] - arr2[1];
            else
                return arr1[0] - arr2[0];
        });

        for(int i = 0; i < arr.length; i++)
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');

        System.out.println(sb);
    }
}