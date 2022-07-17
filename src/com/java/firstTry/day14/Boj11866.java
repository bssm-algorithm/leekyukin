package com.java.firstTry.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }


        if (K == 1) {
            for (int j = 0; j < list.size(); j++) {
                int n = list.get(j);
                sb.append(n);
                if (j != list.size() -1) {
                    sb.append(", ");
                }
                else {
                    sb.append(">");
                }
            }
        }
        else {
            List<Integer> result = new ArrayList<>();

            int i = 0;
            int cnt = 0;
            while (list.size() != 0) {
                cnt++;
                i %= list.size();
                if (cnt == K) {
                    int n = list.get(i);
                    result.add(n);
                    list.remove(i);
                    cnt = 1;
                }
                i++;
            }


            for (int j = 0; j < result.size(); j++) {
                int n = result.get(j);
                sb.append(n);
                if (j != result.size() -1) {
                    sb.append(", ");
                }
                else {
                    sb.append(">");
                }
            }
        }


        System.out.println(sb);
    }
}
