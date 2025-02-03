package com.cote.baekjoon;

import java.util.Scanner;

public class GroupWordsChecker1316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int words = in.nextInt();
        in.nextLine();
        int count = 0;
        for (int i = 0; i < words; i++) {
            String word = in.nextLine();

            while (word.length()>0){
                word = word.replaceAll(String.valueOf(word.charAt(0))," ").stripLeading();
                if(word.contains(" ")){
                    break;
                }
            }
            if(word.length()==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
