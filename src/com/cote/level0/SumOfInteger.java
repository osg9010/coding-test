package com.cote.level0;

public class SumOfInteger {
   static class Solution {
        public int solution(String num_str) {
            int answer = 0;
            for (int i = 0; i < num_str.length(); i++) {
                answer+= Integer.parseInt(String.valueOf(num_str.charAt(i)));
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("12345");
        System.out.println(solution1);
    }
}
