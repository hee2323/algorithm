package com.edu.algorithm;

import java.util.Scanner;

public class Main9h { // 2884 알람 시계
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if ( 0 <= H && H <= 23  && 0 <= M && M <= 59 ) {
            if ( M - 45 < 0 ) {
                if ( H - 1 < 0 ) {
                    H = 23;
                } else {
                    H--;
                }
                M = M + 15;
            } else {
                M = M - 45;
            }
            System.out.println(H+" "+M);
        } else {
            return;
        }
    }
}