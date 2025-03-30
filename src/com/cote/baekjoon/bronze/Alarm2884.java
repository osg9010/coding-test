package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class Alarm2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(b >= 45){
            b = b-45;
            System.out.print(a + " " + b);
        }else{
            if(a >= 1){
                a--;
                b+=15;
                System.out.print(a + " " + b);
            }else{
                a = 23;
                b += 15;
                System.out.print(a + " " + b);
            }
        }
    }
}
