package com.cote.level0;

public class PaperCut {
  static class Solution {
        public int solution(int M, int N) {
            int answer = M-1 + (N-1)* M;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(2, 2);
        System.out.println(solution1);
    }
}
