package com.cote.level0;
import java.util.Scanner;

public class PrintLoop {

    public static class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        }
    }
}
