package com.edu.algorithm;

import java.util.Scanner;

public class Main46 { // 2839 설탕배달
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 0;

        if (N < 2 && N > 5001) {
            return;
        }

        while (true) {
            if (N % 5 == 0) {
                min += N / 5;
                System.out.println(min);
                break;
            } else {
                N -= 3;
                min++;
            }

            if (N < 0) {
                System.out.print("-1");
                break;
            }
        }
    }
}
