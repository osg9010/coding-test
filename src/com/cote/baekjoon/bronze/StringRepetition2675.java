package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRepetition2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            String[] split = row.split(" ");
            int count = Integer.parseInt(split[0]);
            String string = split[1];

            for (int j = 0; j < string.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }


    }
}
