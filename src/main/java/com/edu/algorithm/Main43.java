package com.edu.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main43 { // 10809 알파벳 찾기 / 아스키코드 이용
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word =  br.readLine();
        int[] result = new int[26];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i) - 'a';
            if(result[num] == -1) {
                result[num] = i;
            }
        }

        for (int i =0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
