package com.cote.baekjoon;

import java.util.Scanner;

public class ThreeDigitsMultiplication2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        for (int i = 0; i < b.length(); i++) {
            int num = Integer.parseInt(a) * Integer.parseInt(String.valueOf(b.charAt(b.length() - i - 1)));
            System.out.println(num);
        }

        System.out.println(Integer.parseInt(a)*Integer.parseInt(b));


    }
}
