package com.java.firstTry.day07;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1541 {
    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        String[] minus = input.split("\\-");

        int sum = 0;
        int[] val = new int[minus.length];
        Arrays.fill(val, 0);

        for(int i = 0; i < minus.length; i++) {
            String[] plus = minus[i].split("\\+");
            for(int j = 0; j < plus.length; j++) {
                val[i] += Integer.parseInt(plus[j]);
            }
        }
        sum = val[0];
        for(int i = 1; i < val.length; i++)
            sum -= val[i];

        System.out.println(sum);
    }
}
