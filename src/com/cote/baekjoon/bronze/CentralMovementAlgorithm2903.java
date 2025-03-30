package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class CentralMovementAlgorithm2903 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int n = 2;

        for (int i = 0; i < x; i++) {
            n =(int) (n + Math.pow(2,i));
        }
        System.out.println(n*n);
    }
}
