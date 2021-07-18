package com.edu.algorithm;

import java.util.Scanner;

public class Main40 { // 1712 손익분기점
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int cnt = 1;

        // A / (C - B) < BEP  // A랑 BEP는 양수 / C - B가 음수가 되면 손익분기점(BEP) 존재X

        if (A < 0 && B < 0 && C < 0) {
            return;
        }

        if (C - B < 0){
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}