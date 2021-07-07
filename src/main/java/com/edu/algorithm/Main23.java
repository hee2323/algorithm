package com.edu.algorithm;

import java.util.Scanner;

public class Main23 { // 2439 별 찍기 (2)
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= n - i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}