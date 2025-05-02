package com.cote.baekjoon.bronze;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NonSubmitter5597 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            integers.add(i+1);
        }
        while (in.hasNextLine()) {
            integers.remove(Integer.valueOf(in.nextLine()));
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
