package com.java.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj10814 {

    public static class User {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        List<User> users = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            users.add(new User (
                    Integer.parseInt(st.nextToken()),
                            st.nextToken()
                    )
            );
        }

        users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(
                        user -> sb
                                .append(user.getAge())
                                .append(' ')
                                .append(user.getName())
                                .append("\n")
                );

        System.out.println(sb);
    }
}
