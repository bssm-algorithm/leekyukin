package com.java.firstTry.day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3613 {

    public static int checkLang(String str) {
        boolean java = false;
        boolean c = false;

        int cnt = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == '_') {
                c = true;
                cnt++;
            }

            else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                java = true;
        }

        if (cnt == str.length()) {
            return 3;
        }
        else if (c && java)
            return 2;
        else if (java) return 0;
        else return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        boolean flag = true;
        if (checkLang(input) == 1) {
            StringTokenizer st = new StringTokenizer(input, "_");

            int size = st.countTokens();
            String str = "";
            for(int i = 0; i < size; i++) {

                str = st.nextToken();

                if(flag)
                    System.out.print(str.charAt(0));
                else
                    System.out.print((char)(str.charAt(0)-32));

                for (int j = 1; j < str.length(); j++)
                    System.out.print(str.charAt(i));

                flag = false;
            }

            if(str.charAt(size-1) == '_') {
                System.out.println("_");
            }
        }
        else if (checkLang(input) == 0) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) <= 'Z') {
                    System.out.print("_");
                    System.out.print((char)(input.charAt(i)+32));
                }
                else System.out.print(input.charAt(i));
            }
        }
        else if (checkLang(input) == 3)
            System.out.println(input);
        else {
            System.out.println("Error!");
        }

    }
}
