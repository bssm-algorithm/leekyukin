package com.java.firstTry.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1254 {
    static boolean isPalindrome(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-1-i))
                cnt++;
        }

        return str.length()/2 == cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int i = 0;
        while (!isPalindrome(str+sb)) {
            sb.setLength(0);
            for(int j = 0; j < i; j++) {
                sb.insert(0, str.charAt(j));
            }
            i++;
        }

        System.out.println((sb+str).length());

    }
}
