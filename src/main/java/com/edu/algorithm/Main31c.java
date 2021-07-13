package com.edu.algorithm;

import java.util.Scanner;

public class Main31c { // 1110 더하기 사이클
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n < 10) {
            n *= 10;
        }

        int cnt = 0;
        int num = n;

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;

            if (num == n) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
