package com.java.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String input = bf.readLine();
            for(int j = 0; j < 8; j++) {
                board[i][j] = input.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    if (board[i][j] == 'F') cnt++;
                if (i % 2 == 1 && j % 2 == 1)
                    if (board[i][j] == 'F') cnt++;
            }
        }

        System.out.println(cnt);
    }
}
