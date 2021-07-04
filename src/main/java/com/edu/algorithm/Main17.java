package com.edu.algorithm;

import java.util.Scanner;

public class Main17 { // 10951 A+B-4
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A, B = 0;

        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}