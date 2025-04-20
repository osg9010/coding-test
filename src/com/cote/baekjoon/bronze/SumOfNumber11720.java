package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCount = Integer.parseInt(br.readLine());
        String string = br.readLine();
        int sum = 0;
        for (int i = 0; i < numCount; i++) {
            int num = Integer.parseInt(String.valueOf(string.charAt(i)));
            sum += num;
        }
        System.out.println(sum);

    }
}
