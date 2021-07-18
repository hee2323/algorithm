package com.edu.algorithm;

import java.util.Scanner;

public class Main42 { // 11720 숫자의 합
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += a.charAt(i)-'0'; // charAt은 문자로 인식하므로 아스키코드 값을 빼줘서 정수형으로 만들기
        }
        System.out.print(sum);
    }
}

