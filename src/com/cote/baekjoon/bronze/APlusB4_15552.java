package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");
            int intVal = Integer.parseInt(s1[0])+Integer.parseInt(s1[1]);
            sb.append(intVal+"\n");
        }
        System.out.println(sb);
    }
}
