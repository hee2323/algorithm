package com.edu.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main44 { // 2751 수 정렬하기 (2)
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}
