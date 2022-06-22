package com.java.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj1784 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String N = bf.readLine();

        StringTokenizer st = new StringTokenizer(N, " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(bf.readLine());
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {

            String str = bf.readLine();
            if(set.contains(str)) {
                list.add(str);
            }
        }

        System.out.println(list.size());
        list.stream().sorted().forEach(System.out::println);
    }
}
