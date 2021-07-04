package com.edu.algorithm;

import java.util.Scanner;

public class Main15_1 { // 10950 A+B-3
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = 1;
        int B = 1;

        for(int i = 0; i < N; i++) {
            if ( 0 < A && A < 10 && 0 < B && B < 10 ){
                A = sc.nextInt();
                B = sc.nextInt();
            } else {
                sc.close();
            }
            System.out.println(A + B);
        }
        sc.close();
    }
}