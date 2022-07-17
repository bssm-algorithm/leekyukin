package com.java.firstTry.day21;

import java.io.IOException;
import java.util.Scanner;

public class Boj6550 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            String[] str = scan.nextLine().split(" ");

            String s = str[0]; String t = str[1];

            int cnt = 0;
            int j = 0;
            for (int i = 0; i < t.length(); i++) {
                if (j == s.length()) {
                    break;
                }

                if (s.charAt(j) == t.charAt(i)) {
                    j++;
                    cnt++;
                }
            }

            System.out.println(cnt == s.length() ? "Yes" : "No");
        }
    }
}
