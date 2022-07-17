package com.java.firstTry.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int j = 0; j < N; j++) {
            String input = br.readLine();
            String n2 = "";
            for (int i = input.length()-1; i >= 0; i--) {
                n2 += input.charAt(i);
            }

            int sum = Integer.parseInt(input) + Integer.parseInt(n2);

            String str = String.valueOf(sum);

            int cnt = 0;
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) == str.charAt(str.length()-1-i)) {
                    cnt++;
                }
            }

            if (cnt == str.length()/2)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
