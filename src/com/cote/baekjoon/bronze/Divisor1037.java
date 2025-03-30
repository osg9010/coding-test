package com.cote.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Divisor1037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            integers.add(in.nextInt());
        }
        integers.sort(Comparator.naturalOrder());
        System.out.println(integers.get(0) * integers.get(integers.size()-1));
    }
}
