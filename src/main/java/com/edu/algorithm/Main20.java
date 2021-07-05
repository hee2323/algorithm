package com.edu.algorithm;

import java.util.Scanner;

public class Main20 { // 10952 A + B (5)
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();
            if (A == 0 && B == 0) {
                break;
            } else {
                System.out.println(A + B);
            }
        }
        sc.close();
    }
}