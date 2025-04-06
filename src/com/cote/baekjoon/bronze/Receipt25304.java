package com.cote.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            sum += price * count;
        }

        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
