package com.edu.algorithm;

import java.util.Scanner;

public class Main33c { // 4344 평균은 넘겠지
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for(int i = 0; i < C; i++) {
            int n = sc.nextInt();
            int[] score = new int[n];
            double sum = 0;
            for(int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = sum / n;
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(score[j] > avg) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f", (double)count / n * 100) + "%");
        }
    }
}