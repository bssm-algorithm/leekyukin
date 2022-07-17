package com.java.firstTry.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj7568 {
    static class Person {
        int x, y;

        Person(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static int strToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        Person[] people = new Person[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            people[i] = new Person(
                    strToInt(st.nextToken()),
                    strToInt(st.nextToken())
            );
        }

        int[] result = new int[N];
        Arrays.fill(result, 1);
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {

                if (people[i].x < people[j].x) {
                    if (people[i].y < people[j].y) {

                        result[i]++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(result).forEach(n->sb.append(n).append(" "));

        System.out.println(sb);
    }
}
