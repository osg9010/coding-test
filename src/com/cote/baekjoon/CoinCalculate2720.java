package com.cote.baekjoon;

import java.util.Scanner;

public class CoinCalculate2720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseCount = in.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int total = in.nextInt();
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            q = total / 25;
            total = total - (25 * q);
            d = total / 10;
            total = total - (10 * d);
            n = total / 5;
            total = total - (5 * n);
            p = total;
            System.out.println(q + " " + d + " "+ n +" "+ p);
        }
    }
}
