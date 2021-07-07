package com.edu.algorithm;

import java.util.Scanner;

public class Main25_1 { // 2562 최댓값
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int max = 1;
        int max_no = 1;

        while (max < 9) {
            int new_n = sc.nextInt();
            max++;
            if (new_n > num) {
                num = new_n;
                max_no = max;
            }
        }
        System.out.println(num);
        System.out.println(max_no);
    }
}
