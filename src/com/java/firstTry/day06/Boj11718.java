package com.java.firstTry.day06;

import java.io.IOException;
import java.util.Scanner;

public class Boj11718 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            System.out.println(input);
        }
        scan.close();
    }
}
