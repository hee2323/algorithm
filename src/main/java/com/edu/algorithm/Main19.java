package com.edu.algorithm;

import java.util.Scanner;

public class Main19 { // 10998 A x B
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (0 < A && A < 10 && 0 < B && B < 10) {
            System.out.println(A * B);
        } else {
            return;
        }
        sc.close();
    }
}