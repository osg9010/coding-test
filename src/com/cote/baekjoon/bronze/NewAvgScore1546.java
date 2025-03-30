package com.cote.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAvgScore1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double sum = 0;
        double avg = 0.0;
        ArrayList<Integer> scores = new ArrayList<>();
        int highScore = 0;
        for (int i = 0; i < a; i++) {
            int score = in.nextInt();
            if(highScore < score){
                highScore = score;
            }
            scores.add(score);
        }

        for (int i = 0; i < a; i++) {
            double score = (double)scores.get(i)/1.0;
            sum += (double)(score / (double)highScore * 100);
        }
        avg = sum/a;
        System.out.println(avg);

    }
}
