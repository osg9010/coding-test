package com.cote.level1;

import java.util.Arrays;

public class PrimeNumber {
   static class Solution {
        public int solution(int n) {
            int answer = 0;
            boolean[] primes = new boolean[n+1];
            Arrays.fill(primes,true);
            primes[0] = primes[1] = false;

            for (int i = 2; i*i <=n ; i++) {
                if(primes[i]){
                    for (int j = i*i; j <= n; j += i) {
                        primes[j] = false;
                    }
                }
            }

            for (int i = 0; i <= n; i++) {
                if(primes[i]) answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int solution = so.solution(10);
        System.out.println(solution);
    }
}
