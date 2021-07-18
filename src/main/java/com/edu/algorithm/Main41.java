package com.edu.algorithm;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main41 { // 2675 문자열 반복
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        String pattern = "^[a-zA-Z]*$"; // 정규표현식 \$%*+-./: 추가해야됨

        if (1 <= T && T <= 1000) {
            for(int i = 0; i < T; i++) {
                int R = in.nextInt();
                String S = in.next(); // nextLine()넣으면 에러남
                boolean regex = Pattern.matches(pattern, S);
                if (regex) {
                    for(int j = 0; j < S.length(); j++) {
                        for(int k = 0; k < R; k++) {
                            System.out.print(S.charAt(j));
                        }
                    }
                    System.out.println();
                }else {
                    return;
                }
            }
        }else {
            return;
        }
    }
}
