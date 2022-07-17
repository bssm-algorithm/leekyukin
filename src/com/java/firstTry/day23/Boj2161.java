package com.java.firstTry.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> cards = new ArrayList<>();
        for (int i = 0 ; i < N; i++) {
            cards.add(i+1);
        }

        int n = 0;
        while (cards.size() != 1) {
            System.out.print(cards.remove(0) + " ");
            cards.add(cards.size()-1, cards.remove(0));
            if (cards.size() == 1) System.out.println(cards.get(0));
        }
    }
}
