package com.cote.baekjoon.bronze;

import java.util.Scanner;

public class YourAVGScore25206 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        double total = 0;


        for (int i = 0; i < 20; i++) {
            in.next();
            double v = in.nextDouble();
            String thisScore = in.next();
            in.nextLine();

            if(thisScore.equals("P")){
                continue;
            }else {
                if (thisScore.equals("A+")) {
                    total += 4.5 *  v ;
                    count += v;
                } else if (thisScore.equals("A0")) {
                    total += 4.0 *  v ;
                    count += v;
                } else if (thisScore.equals("B+")) {
                    total += 3.5 *  v ;
                    count += v;
                } else if (thisScore.equals("B0")) {
                    total += 3.0 *  v ;
                    count += v;
                } else if (thisScore.equals("C+")) {
                    total += 2.5 *  v ;
                    count += v;
                } else if (thisScore.equals("C0")) {
                    total += 2.0 *  v ;
                    count += v;
                } else if (thisScore.equals("D+")) {
                    total += 1.5 *  v ;
                    count += v;
                } else if (thisScore.equals("D0")) {
                    total += 1.0 *  v ;
                    count += v;
                } else if (thisScore.equals("F")) {
                    count += v;
                }
            }

        }
        double avg = total/count;
        System.out.println(avg);
    }
}
