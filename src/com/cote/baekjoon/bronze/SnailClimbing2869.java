package com.cote.baekjoon.bronze;

import java.util.Scanner;


public class SnailClimbing2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int up = in.nextInt();   // 낮에 올라가는 거리
        int down = in.nextInt(); // 밤에 미끄러지는 거리
        int length = in.nextInt(); // 정상까지의 거리
        in.close(); // Scanner 닫기

        // (length - up)은 마지막 날에는 미끄러지지 않으므로 제외
        int days = (length - up) / (up - down) + 1;

        // 나머지가 있을 경우 하루 추가
        if ((length - up) % (up - down) != 0) {
            days++;
        }

        System.out.println(days);
    }
}
