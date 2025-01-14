package com.cote.baekjoon;

import java.util.Scanner;

public class CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String s = sentence.replaceAll("c=", "1").replaceAll("c-", "1").replaceAll("dz=", "1")
                .replaceAll("d-", "1").replaceAll("lj", "1").replaceAll("nj", "1")
                .replaceAll("s=", "1").replaceAll("z=", "1");

        System.out.println(s.length());
    }
}
