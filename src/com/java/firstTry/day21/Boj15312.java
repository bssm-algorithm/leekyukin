package com.java.firstTry.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[] {
                3, 2, 1, 2, 3, 3, 2, 3, 3, 2,
                2, 1, 2, 2, 1, 2, 2, 2, 1, 2,
                1, 1, 1, 2, 2, 1
        };

        String his = br.readLine();
        String her = br.readLine();

        int[] intArr = new int[his.length() + her.length()];
        int j = 0, k = 0;
        for (int i = 0; i < his.length() + her.length(); i++) {
            intArr[i] = (i % 2 == 0) ?
                    arr[his.charAt(j++) - 65] : arr[her.charAt(k++) - 65];
        }

        for (int i = 0; i < intArr.length-2; i++) {
            for (int l = 0; l <  intArr.length-1-i; l++) {
                intArr[l] = (intArr[l] + intArr[l+1]) % 10;
            }
        }

        System.out.print(intArr[0]);
        System.out.println(intArr[1]);

    }
}
