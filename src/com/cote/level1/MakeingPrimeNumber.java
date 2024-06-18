package com.cote.level1;

public class MakeingPrimeNumber {
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    for (int k = j+1; k < nums.length; k++) {
                        sum = nums[i]+nums[j]+nums[k];
                        if(isPrime(sum)){
                            answer++;
                        }

                    }

                }
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
