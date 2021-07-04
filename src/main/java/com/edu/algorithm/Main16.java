package com.edu.algorithm;

import java.util.Scanner;

public class Main16 { // 9498 시험 성적
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int sc = in.nextInt();

        if ( 0 <= sc && sc <= 100 ) {
            if (90 <= sc && sc <= 100) {
                System.out.println("A");
            } else if (80 <= sc && sc <= 89) {
                System.out.println("B");
            } else if (70 <= sc && sc <= 79) {
                System.out.println("C");
            } else if (60 <= sc && sc <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}