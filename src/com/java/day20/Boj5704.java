package com.java.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Boj5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> alpha = List.of(
                "a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p",
                "q","r","x","t","u","v","w","x","y","z"
        );

        String str = "";

        while (true) {
            str = br.readLine();

            if (str.equals("*")) {
                break;
            }

            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                if(str.contains(alpha.get(i)))
                    cnt++;
            }

            System.out.println(cnt == 26 ? "Y" : "N");
        }

    }
}
