package com.java.firstTry.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");

        int[] arr = new int[10];
        for (int i = 0 ; i < input.length; i++) {
            int index = Integer.parseInt(input[i]);
            arr[index]++;
        }

        int max = 0;
        for (int i = 0; i < input.length; i++) {
            int index = Integer.parseInt(input[i]);
            int comp;
            if (index == 6 || index ==  9) {
                int n = arr[6]+arr[9];
                comp = n % 2 == 0 ?  n/2 : n/2+1 ;
            }
            else {
                comp = arr[index];
            }
            max = Math.max(comp,max);
        }

        System.out.println(max);
    }
}
