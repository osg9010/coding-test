package com.cote.baekjoon;

import java.util.Scanner;

public class PrintSmallNum10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < a; i++) {
            int c = in.nextInt();
            if(c<b){
                System.out.print(c +" ");
            }
        }

    }
}
