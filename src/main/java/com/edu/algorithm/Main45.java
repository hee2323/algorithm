package com.edu.algorithm;

public class Main45 { // 4673 셀프넘버
    public static void main(String args[]) {

        int[] numArr = new int[10001];

        for(int i = 1; i < 10001; i++) {
            int num = d(i);

            if (num < 10001) {
                numArr[num] = 1;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (numArr[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int sum = n;

        while (n != 0) {
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
}
