package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class LeastCommonMultiple1934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b,c;
        for (int i = 0; i < a; i++) {
            b = in.nextInt();
            c = in.nextInt();

            System.out.println(lcm(b,c));

        }
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
