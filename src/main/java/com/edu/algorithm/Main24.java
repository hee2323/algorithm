package com.edu.algorithm;

import java.util.Scanner;

public class Main24 { // 10871 X보다 작은 수
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n, x;
        n = sc.nextInt();
        x = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}