package com.java.secondTry.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17413 {
    public static void print(Stack s) {
        for (int i = s.size()-1; i >= 0; i--) {
            System.out.print(s.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Stack<Character> stack = new Stack<>();

        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                print(stack);
                stack.clear();
                flag = true;
                System.out.print(s.charAt(i));
            }
            else if (s.charAt(i) == '>') {
                flag = false;
                System.out.print(s.charAt(i));
            }
            else if (flag) {
                System.out.print(s.charAt(i));
            }
            else {
                if (s.charAt(i) == ' ') {
                    print(stack);
                    stack.clear();
                    System.out.print(' ');
                }
                else
                    stack.push(s.charAt(i));
            }
        }
        print(stack);
    }
}
