package com.cote.baekjoon;

import java.util.Scanner;

public class LetterOfNth27866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int n = in.nextInt();
        System.out.println(string.charAt(n-1));
    }
}
