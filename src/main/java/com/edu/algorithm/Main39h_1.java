package com.edu.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main39h_1 { // 1157 단어공부 / 아스키코드X 반복문 1번만 사용
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word =  br.readLine();
        int[] alpha = new int[26];
        int max;
        String result;

        for (int i = 0; i < word.length(); i++) {
            int cnt = Character.toUpperCase(word.charAt(i)) - 65;
            alpha[cnt]++;
        }


    }
}
