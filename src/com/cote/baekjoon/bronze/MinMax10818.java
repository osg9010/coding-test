package com.cote.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);

    }
}
