package com.cote.level0;

public class CountOfDice {
    static class Solution {
        public int solution(int[] box, int n) {
            int answer = 1;
            for (int i : box) {
                answer *= i/n;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int count = solution.solution(new int[]{10, 8, 6}, 3);
        System.out.println(count);
    }
}
