package com.edu.algorithm;

import java.util.HashSet;
import java.util.Scanner;

public class Main38c { // 3052 나머지
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            set.add(num % 42);
        }
        System.out.println(set.size());
    }
}
