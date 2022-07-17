package com.java.firstTry.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int cnt = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-1-i)) {
                cnt++;
            }
        }

        int want;
        if (str.length() % 2 == 1) {
            want = (str.length()-1) / 2;
        }
        else {
            want = str.length() / 2;
        }

        if (want == cnt) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
