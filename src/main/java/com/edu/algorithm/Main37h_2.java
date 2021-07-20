package com.edu.algorithm;

import java.util.Scanner;

public class Main37h_2 { // 8958 OX퀴즈
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            String str = sc.next();
            int score = 0;
            int add = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    add++;
                    score += add;
                } else {
                    add = 0;
                }
            }
            System.out.println(score);
        }
    }
}
