package com.edu.algorithm;

import java.util.Scanner;

public class Main25c { // 2562 최댓값
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        int max_no = 0;

        for(int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if(num > max) {
                max = num;
                max_no = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(max_no);
    }
}
