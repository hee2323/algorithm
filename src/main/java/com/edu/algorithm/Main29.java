package com.edu.algorithm;

import java.util.Scanner;

public class Main29 { // 2741 N 찍기
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int i = 1;

        while (i <= N) {
            System.out.println(i);
            i++;
        }
    }
}