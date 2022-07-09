package com.java.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj16916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String p = br.readLine();
        int i = 0;

        int j = 0;
        for (i = 0; i < s.length(); i++) {
            if (j == p.length())
                break;
            if(s.charAt(i) == p.charAt(j))
                j++;
            else
                j = 0;
        }

        if (j == p.length())
            System.out.println(1);
        else
            System.out.println(0);
    }
}
