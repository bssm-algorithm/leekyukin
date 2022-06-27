package com.java.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int i, num = 665;;
        for (i = 0; i < N; i++) {

            while(true) {

                num++;
                if(String.valueOf(num).contains("666")) {
                    break;
                }
            }
        }

        System.out.println(num);
    }
}
