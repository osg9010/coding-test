package com.cote.level2;

public class NNArray {
    static class Solution {
        public int[] solution(int n, long left, long right) {
            int length = (int) (right - left) + 1;
            int[] answer = new int[length];

            for (long i = left; i <= right; i++) {

                int row = (int) (i / n);
                int col = (int) (i % n);
                answer[(int) (i - left)] = Math.max(row, col) + 1;
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(3, 2, 3);
        for (int i : solution1) {
            System.out.println(i);
        }
    }
}
