package com.java.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Boj11651 {
    public static void main(String[] args) throws IOException {
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

            if (arr1[1] == arr2[1])
                return arr1[0] - arr2[0];
            else
                return arr1[1] - arr2[1];
        });

        for(int i = 0; i < arr.length; i++)
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');

        System.out.println(sb);
    }
}
