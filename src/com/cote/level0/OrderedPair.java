package com.cote.level0;

public class OrderedPair {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if(n%i == 0){
                    answer++;
                }

            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int so = solution.solution(100);
        System.out.println(so);

    }
}
