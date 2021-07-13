package com.edu.algorithm;

import java.util.Scanner;

public class Main35c { // 1546 평균
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] score = new int[N];
        int max = 0;

        if (N > 1000) {
            return;
        }

        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        double sum = 0;
        for(int j = 0; j < N; j++) {
//            System.out.println(score[j]);
//            System.out.println("score[j]/max : " + (score[j] / max));
//            System.out.println("score[j]/max : " + ((double)score[j] / max)); // 이 부분에서 (double)중요
            sum += ((double)score[j]/max) * 100;
        }
        double avg = sum / N;
        System.out.println(sum);
    }
}
