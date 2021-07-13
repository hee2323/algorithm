package com.edu.algorithm;

import java.util.Scanner;

public class Main32 { // 2742 기찍 N
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int i = N;

        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}