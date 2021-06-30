package com.edu.algorithm;

import java.util.Scanner;

public class Main12 { // 2753 윤년
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if ( 1 < a && a < 4000 ) {
            if ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        } else {
            return;
        }
    }
}