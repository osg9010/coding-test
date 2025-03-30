package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class BaseConversion11005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer answer = new StringBuffer();
        long num = in.nextLong();
        int base = in.nextInt();
        char ten = 'A';

        while (num > 0){
            long remain = num % base;
            if(remain >= 10){
                char c = (char) (ten+remain-10);
                answer.insert(0,c);
            }else{
                answer.insert(0,remain);
            }
            num  = num / base;
        }

        System.out.println(answer);
    }
}
