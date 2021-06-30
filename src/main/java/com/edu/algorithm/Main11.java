package com.edu.algorithm;

import java.util.Scanner;

public class Main11 { // 1001 A-B
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (0 < A && A < 10 && 0 < B && B < 10) {
            System.out.print(A - B);
        } else {
            return;
        }
    }
}