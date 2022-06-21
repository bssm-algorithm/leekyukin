package com.java.day07;

import java.util.Scanner;
import java.util.Stack;

public class Boj4949 {
    static String checkBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '[') {
                stack.push(c);
            }

            else if (c == ')') {

                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }

                else {
                    stack.pop();
                }
            }
            else if (c == ']') {

                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }

                else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        while(!(s=scan.nextLine()).equals(".")) {
            System.out.println(checkBracket(s));
        }
    }
}