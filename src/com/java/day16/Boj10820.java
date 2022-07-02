package com.java.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine()) != null) {
            int[] arr = {0, 0, 0, 0} ;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if ('0' <= c && c <= '9')
                    arr[2]++;
                if ('A' <= c && c <= 'Z')
                    arr[1]++;
                if ('a' <= c && c <= 'z')
                    arr[0]++;
                if (' ' == c)
                    arr[3]++;
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}
