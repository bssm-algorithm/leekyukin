package com.java.firstTry.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for ( int i = 0; i < n.length(); i++ ) {
            int octal = n.charAt(i) - '0';

            String s = binary[octal];
            if (i == 0) {
                if (s.startsWith("000")) {
                    System.out.print(0);
                }
                else if (s.startsWith("00")) {
                    System.out.print(1);
                }
                else if (s.startsWith("010")) {
                    System.out.print(10);
                }
                else if (s.startsWith("011")) {
                    System.out.print(11);
                }
                else {
                    System.out.print(binary[octal]);
                }
            } else {
                System.out.print(binary[octal]);
            }
        }
    }
}