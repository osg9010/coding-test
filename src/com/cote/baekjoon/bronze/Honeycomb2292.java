package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class Honeycomb2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int line = 1;
        int count = 1;
        while (line <= k-1) {
            line = line + count * 6;
            count++;
        }
        System.out.println(count);
    }
}
