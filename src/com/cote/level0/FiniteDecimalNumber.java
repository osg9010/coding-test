package com.cote.level0;

public class FiniteDecimalNumber {
    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            int gcm = gcm(a,b);
            a = a/gcm;
            b = b/gcm;

            while (b != 1){
                if(b % 2 == 0){
                    b /= 2;
                }else if(b % 5 == 0){
                    b /= 5;
                }else{
                    answer =  2;
                    break;
                }
            }

            if(b == 1){
                answer = 1;
            }

            return answer;
        }

        public int gcm(int a,int b){
            int c = 0;
            while (b != 0){
                c = a%b;
                a = b;
                b = c;
            }
            return a;
        }
    }


}
