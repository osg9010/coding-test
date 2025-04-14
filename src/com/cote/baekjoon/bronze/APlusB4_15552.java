package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = br.read();
        for (int i = 0; i < num; i++) {
            int intVal = br.read() + br.read();
            sb.append(intVal+"\n");
        }
    }
}
