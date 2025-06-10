package com.cote.baekjoon.bronze;

import java.util.Scanner;

/**
 * 9788968322*73 > 2
 */

public class ISBN14626 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String isbn = in.next();
        int sum = 0;
        int missingIndex = isbn.indexOf('*');
        int missingWeight = (missingIndex % 2 == 0) ? 1 : 3;
        int checkDigit = Character.getNumericValue(isbn.charAt(12));

        if (missingIndex == 12) {
            for (int i = 0; i < 12; i++) {
                int digit = Character.getNumericValue(isbn.charAt(i));
                sum += (i % 2 == 0) ? digit : digit * 3;
            }
            int m = (10 - (sum % 10)) % 10;
            System.out.println(m);
        } else {
            // '*'가 중간에 있는 경우 (0~9 대입해서 유효한 값 찾기)
            for (int candidate = 0; candidate <= 9; candidate++) {
                sum = 0;
                for (int i = 0; i < 12; i++) {
                    if (i == missingIndex) {
                        sum += (i % 2 == 0) ? candidate : candidate * 3;
                    } else {
                        int digit = Character.getNumericValue(isbn.charAt(i));
                        sum += (i % 2 == 0) ? digit : digit * 3;
                    }
                }
                int m = (10 - (sum % 10)) % 10;
                if (m == checkDigit) {
                    System.out.println(candidate);
                    break;
                }
            }
        }
    }
}
