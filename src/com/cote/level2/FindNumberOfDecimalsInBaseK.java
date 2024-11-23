package com.cote.level2;

public class FindNumberOfDecimalsInBaseK {
   static class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            StringBuilder number = new StringBuilder();
            if(k != 10){
                while (n>0){
                    number.insert(0,String.valueOf(n % k));
                    n /= k;
                }
            }else{
                number.insert(0,String.valueOf(n));
            }
            String[] split = number.toString().split("0");

            for (int i = 0; i < split.length; i++) {
                if(!split[i].isEmpty()&&isPrime(Long.parseLong(split[i]))){
                    answer++;
                }
            }
            return answer;
        }
        public boolean isPrime(Long n){
            boolean isPrimeNum = true;
            if(n < 2){return false;}
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    isPrimeNum=false;
                }
            }
            return isPrimeNum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(437674, 3);
        System.out.println(solution1);
    }
}
