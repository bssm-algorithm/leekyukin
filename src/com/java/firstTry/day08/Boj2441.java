package com.java.firstTry.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for(int i = N; i > 0; i--) {
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}