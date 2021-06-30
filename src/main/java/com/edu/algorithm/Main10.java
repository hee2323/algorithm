package com.edu.algorithm;

import java.util.Scanner;

public class Main10 { // 2588 곱셈
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        // num2의 100단위 자리 a3, 10단위 자리 a2, 1단위 자리 a1
        // (3), (4), (5)는 b1, b2, b3

        int a3 = num2 / 100;
        int a2 = (num2 % 100) / 10;
        int a1 = num2 % 10;

        int b1 = num1 * a1;
        int b2 = num1 * a2;
        int b3 = num1 * a3;

        int result = num1 * num2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(result);
    }
}