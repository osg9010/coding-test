package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class OvenTimer2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int time = (b+c) / 60;
        int min = (b+c) % 60;
        a += time;
        if(a >= 24){
            a -= 24;
        }
        System.out.println(a + " " + min);


    }
}
