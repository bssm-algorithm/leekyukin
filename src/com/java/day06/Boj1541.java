package com.java.day06;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj1541 {
    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = bf.readLine();

        boolean flag = false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));

            if (!stack.isEmpty() && i != input.length()-1 && input.charAt(i + 1) == '-') {
                sb.append(')');
                stack.pop();
            }
            if(input.charAt(i) == '-') {
                flag = true;
                stack.push('(');
                sb.append('(');
            }

            if (i == input.length()-1) {
                while (!stack.isEmpty()) {
                    sb.append(')');
                    stack.pop();
                }
            }
        }

        int bracketCnt = 0;
        for (int i = 0; i < sb.length(); i++)
            if (sb.charAt(i) == '(') bracketCnt++;

        int[] brackets = new int[bracketCnt];
        List<Integer> bracketList = new ArrayList<>();
        List<Character> signList = new ArrayList<>();


        int in = 0;
        int i = 0;
       while(sb.charAt(in)=='\0') {
           int l = 0, r = 0;
           for(i = i; sb.charAt(i)=='+' || sb.charAt(i)=='-' || sb.charAt(i)=='('; i++)
                l=i+1;
           for(i = i; sb.charAt(i)=='+' || sb.charAt(i)=='-' || sb.charAt(i)==')'; i++)
                r=i-1;
           int str = Integer.parseInt(sb.substring(l,r));
           bracketList.add(str);
           in++;

       }

       bracketList.forEach(System.out::println);
    }
}
