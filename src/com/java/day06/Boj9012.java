package com.java.day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj9012 {
    static String checkBracket (String str) {
        Stack<Character> stack = new Stack<>();
        stack.clear();
        for ( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == '(')
                stack.push('(');
            else if (str.charAt(i) == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else return "NO";
            }
        }

        if (stack.isEmpty()) return "YES";
        else return "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        List<String> list = new ArrayList<>();

        for ( int i = 0; i < N; i++ )
            list.add(bf.readLine());

        Stack<Character> stack = new Stack<>();
        for ( String str : list )
            System.out.println(checkBracket(str));

    }
}

