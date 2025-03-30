package com.cote.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeanAndMedian2587 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int sum = a+b+c+d+e;
        int avg = sum/5;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(a);
        integers.add(b);
        integers.add(c);
        integers.add(d);
        integers.add(e);

        Collections.sort(integers);

        System.out.println(avg);
        System.out.println(integers.get(2));


    }
}
