package com.edu.algorithm;

import java.util.Scanner;

public class Main21 { // 14681 사분면 고르기
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( -1000 <= x && x <= 1000 && -1000 <= y && y <= 1000 ) {
            if ( x > 0 && y > 0 ) {
                System.out.println(1);
            } else if ( x < 0 && y > 0 ) {
                System.out.println(2);
            } else if ( x < 0 && y < 0 ) {
                System.out.println(3);
            } else if ( x > 0 && y < 0 ) {
                System.out.println(4);
            }
        }
    }
}