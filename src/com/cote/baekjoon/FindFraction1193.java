package com.cote.baekjoon;

import java.util.Scanner;

public class FindFraction1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int denominator = 1;
        int numerator = 1;
        int flag = 0;
        int time = 1; // 홀 - 분자가 더 큼, 짝 - 분모가 더 큼
        int answer = 1;
        while (true){
            if(answer == k){
                break;
            }
            if(flag % 2 != 0){
                if(denominator == 1){
                    flag = 2;
                    time ++;
                    numerator = time;
                }else{
                    numerator++;
                    denominator--;
                }
            }else{
                if(numerator == 1){
                    flag = 1;
                    time ++;
                    denominator = time;
                }else{
                    numerator--;
                    denominator++;
                }
            }
            answer++;
        }
        System.out.println(numerator+"/"+denominator);

    }
}
