package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int[] alpha = new int[26];
        Arrays.fill(alpha,-1);

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(alpha[c - 'a'] == -1){
                alpha[c - 'a'] = i;
            }
        }

        for (int j : alpha) {
            System.out.print(j + " ");
        }
    }
}
