package com.edu.algorithm;

import java.util.Scanner;

public class Main14 { // 2739 구구단
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }

    }
}