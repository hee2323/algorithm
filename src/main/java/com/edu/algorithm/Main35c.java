package com.edu.algorithm;

import java.util.Scanner;

public class Main35c { // 1546 평균
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double [] score = new Double[N];
        double max = 0;

        if (N > 1000) {
            return;
        }

        for(int i = 0; i < N; i++) {
            score[i] = sc.nextDouble();
            if (score[i] > max) {
                max = score[i];
            }
        }
        double sum = 0;
        for(int j = 0; j < N; j++) {
            sum += (score[j]/max) * 100;
        }
        System.out.println(sum / N);
    }
}
