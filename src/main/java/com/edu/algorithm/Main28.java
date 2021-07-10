package com.edu.algorithm;

import java.util.Scanner;

public class Main28 { // 8393 합
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}