package com.edu.algorithm;

import java.util.Scanner;

public class Main30h { // 2577 숫자의 개수
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int x = A * B * C;

        int[] arr = new int[10];

        while(x > 0) {
            arr[x % 10]++;
            x /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}