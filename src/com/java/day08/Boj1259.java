package com.java.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            // 불필요한 0 제거
            int input = Integer.parseInt(bf.readLine());

            if (input == 0) break;

            // split 을 위해 String 으로 전환
            String s = String.valueOf(input);

            String[] c = s.split("");
            StringBuilder reverse = new StringBuilder();

            for (int i = c.length-1; i >= 0; i--) {
                reverse.append(c[i]);
            }

            if (s.contentEquals(reverse)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }
}
