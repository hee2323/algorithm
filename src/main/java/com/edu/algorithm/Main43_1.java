package com.edu.algorithm;

import java.io.*;

public class Main43_1 { // 10809 알파벳 찾기 / indexOf 이용
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word =  br.readLine();

        for (int i = 'a'; i <= 'z'; i++) {
            bw.write(word.indexOf(i) + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
