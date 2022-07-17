package com.java.firstTry.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class BojFail11650 {
    public static class Point {
        int x;
        int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        ArrayList<Point> points = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String tmp = bf.readLine();
            String[] positions = tmp.split(" ");
            int x = Integer.parseInt(positions[0]);
            int y = Integer.parseInt(positions[1]);
            points.add(new Point(x, y));
        }

        points.stream()
                .sorted(Comparator.comparing(Point::getX))
                .sorted(Comparator.comparing(Point::getY))
                .forEach(p -> sb.append(p.getX()).append(' ').append(p.getY()).append('\n'));
        System.out.println(sb);
    }
}
