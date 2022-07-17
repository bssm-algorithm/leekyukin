package com.java.firstTry.day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj2751 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < N; i++)
            list.add(scan.nextInt());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (Integer num : list)
            sb.append(num).append('\n');

        System.out.println(sb);
    }
}
