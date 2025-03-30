package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class LeapYear2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        int isLeapYear = 0;

        if(year% 4 == 0){
            isLeapYear = 1;
            if(year % 100 == 0){
                isLeapYear = 0;
                if(year % 400 == 0){
                    isLeapYear = 1;
                }
            }
        }
        System.out.println(isLeapYear);

    }
}
