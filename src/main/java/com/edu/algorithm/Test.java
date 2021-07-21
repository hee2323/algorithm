package com.edu.algorithm;

public class Test { // 15596 정수 N개의 합

    long sum(int[] a) {
        long total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

}
