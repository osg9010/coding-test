package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class Palindrome10988 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        StringBuffer reverse = new StringBuffer(string).reverse();
        if(string.equals(reverse.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
