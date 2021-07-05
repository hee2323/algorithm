package com.edu.algorithm;

import java.util.Scanner;

public class Main15 { // 10950 A + B (3)
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if ( 0 < A && A < 10 && 0 < B && B < 10 ){
                arr[i] = A + B;
            } else {
                return;
            }
            System.out.println(arr[i]);
        }
        sc.close();
    }
}