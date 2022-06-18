package com.java.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Boj1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();

        Integer[] arr = new Integer[str.length()];
        for(int i = 0; i < str.length(); i++)
            arr[i] = Integer.parseInt(str.substring(i,i+1));

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++)
            sb.append(arr[i]);

        System.out.println(sb);
    }
}
