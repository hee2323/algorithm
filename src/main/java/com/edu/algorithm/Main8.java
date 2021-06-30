package com.edu.algorithm;

import java.util.Scanner;

public class Main8 { // 10869 사칙연산
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

    }
}