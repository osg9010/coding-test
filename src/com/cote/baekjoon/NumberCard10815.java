package com.cote.baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class NumberCard10815 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        HashSet<Integer> integers = new HashSet<>();

        for (int i = 0; i < a; i++) {
            integers.add(in.nextInt());
        }

        int b = in.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < b; i++) {
            if (integers.contains(in.nextInt())) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        // Print all results at once
        System.out.println(result.toString().trim());

        in.close();
    }
}
