package com.cote.level1;

public class CompositeNumber {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 2; i <= n ; i++) {
                if(!isPrime(i)) answer++;
            }


            return answer;
        }

        public boolean isPrime(int n){
            boolean isPrimeNum = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    isPrimeNum=false;
                }
            }
            return isPrimeNum;
        }
    }
}