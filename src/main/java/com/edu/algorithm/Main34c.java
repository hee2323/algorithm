package com.edu.algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main34c { // 1152 단어의 개수
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());
    }
}

