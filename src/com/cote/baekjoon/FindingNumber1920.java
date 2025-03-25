package com.cote.baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class FindingNumber1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        HashSet<Integer> nums1 = new HashSet<>();
        for (int i = 0; i < a; i++) {
            nums1.add(in.nextInt());
        }
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            if(nums1.contains(in.nextInt())){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }
    }
}
