package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class BaseConversion2745 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long answer = 0;
        String num = in.next();
        long base = in.nextLong();
        long numSize = num.length();
        for (int i = 0; i < num.length(); i++) {
            numSize = num.length()-1-i;
            long now = num.charAt(i)-'0';
            if(now > 9){
                now -= 7;
            }
            while (numSize>0){
                now *= base;
                numSize --;
            }
            answer += now;
        }

        System.out.println(answer);
    }
}
