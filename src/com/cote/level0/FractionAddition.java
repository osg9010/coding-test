package com.cote.level0;

public class FractionAddition {
    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];
            int a = numer1 * denom2 + numer2 * denom1;
            int b = denom1*denom2;
            int gcm = gcm(a, b);
            a = a/gcm;
            b = b/gcm;

            answer[0] = a;
            answer[1] = b;


            return answer;
        }

        public int gcm(int a, int b){
            int result = 0;
            while (b != 0){
                result = a%b;
                a = b;
                b = result;
            }
            return a;
        }
    }
}
