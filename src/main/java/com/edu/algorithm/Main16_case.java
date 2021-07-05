package com.edu.algorithm;

import java.util.Scanner;

public class Main16_case { // 9498 시험 성적 / case문으로 풀기
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int sc = in.nextInt();

        if ( 0 <= sc && sc <= 100 ) {
            switch (sc / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
                    break;
            }
        }
    }
}