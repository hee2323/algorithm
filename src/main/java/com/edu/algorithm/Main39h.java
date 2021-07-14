package com.edu.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main39h { // 1157 단어공부
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word =  br.readLine();
        int[] alpha = new int[26];

        for(int i = 0; i < word.length(); i++) {
            int cnt = Character.toUpperCase(word.charAt(i)) - 65;
            alpha[cnt]++;
        }

        int Max = 0;
        for(int i = 0; i < 26; i++) {
            if(Max < alpha[i]) {
                Max = alpha[i];
            }
        }

        int cnt = 0;
        int Max_alpha = 0;
        for(int i = 0; i < 26; i++) {
            if(Max == alpha[i]) {
                cnt++;
                Max_alpha = i;
            }
        }
        if(cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(Max_alpha + 65));
        }
    }
}
