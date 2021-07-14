package com.edu.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main37h { // 8958 OX퀴즈
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strArr = new String[N];

        for(int i = 0; i < N; i++) {
            strArr[i] = br.readLine();
        }

        int sum, cnt;
        for(int i = 0; i < N; i++) {
            sum = 0;
            cnt = 0;
            for(int j = 0; j < strArr[i].length(); j++) {
                if(strArr[i].substring(j, j+1).equals("O")) {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }

    }
}
