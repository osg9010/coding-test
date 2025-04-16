package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfWords1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine().trim();
        if (string.isEmpty()) {
            System.out.println(0);
        } else {
            String[] split = string.split(" ");
            System.out.println(split.length);
        }


    }
}
