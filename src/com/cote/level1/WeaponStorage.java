package com.cote.level1;

public class WeaponStorage {
    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            int sum = 0;
            int[] divisor = new int[number];

            for (int i = 0; i < number; i++) {
                sum = 0;
                for (int j = 1; j*j <= i+1; j++) {
                    if(j*j==i+1) sum++;
                    else if((i+1)%j == 0 ) sum += 2;
                }
                divisor[i] = sum;
            }

            for (int i = 0; i < divisor.length; i++) {
                if(divisor[i] > limit) divisor[i] = power;
            }

            for (int i = 0; i < divisor.length; i++) {
                answer += divisor[i];
            }

            return answer;
        }
    }
}
