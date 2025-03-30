package com.cote.baekjoon.bronze;

import java.util.Scanner;
import java.util.TreeSet;

public class NumberSorting2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> integers = new TreeSet<>();
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            integers.add(in.nextInt());
        }
        integers.iterator().forEachRemaining(System.out::println);
    }
}
