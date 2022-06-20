package com.java.day06;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1541 {
    public static void main(String[] args) throws IOException, ScriptException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine se = scriptEngineManager.getEngineByName("JavaScript");
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
        try {
            System.out.println((int)se.eval(String.valueOf(sb+"")));
        } catch (Exception e) {
            System.out.println("이이잉");
        }

    }
}
