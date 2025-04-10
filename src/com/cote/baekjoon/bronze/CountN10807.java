package com.cote.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class CountN10807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            integers.add(in.nextInt());
        }
        int N = in.nextInt();
        for (int i = 0; i < a; i++) {
            if(integers.get(i)==N){
                count++;
            }
        }

        System.out.println(count);
    }
}
