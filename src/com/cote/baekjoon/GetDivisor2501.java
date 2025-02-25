package com.cote.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class GetDivisor2501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if(a%i == 0) {
                integers.add(i);
            }
        }

        int b = in.nextInt();

        if(integers.size() < b){
            System.out.println(0);
        }else{
            System.out.println(integers.get(b-1));
        }

    }
}
