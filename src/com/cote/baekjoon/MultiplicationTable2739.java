package com.cote.baekjoon;

import java.util.Scanner;

public class MultiplicationTable2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}