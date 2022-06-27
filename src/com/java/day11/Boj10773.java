package com.java.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10773 {
    static int strToInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = strToInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            int input = strToInt(bf.readLine());
            if(input == 0) {
                stack.pop();
            }
            else {
                stack.push(input);
            }
        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}
