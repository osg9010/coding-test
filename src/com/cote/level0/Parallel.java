package com.cote.level0;

public class Parallel {
    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            if (areParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
            if (areParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
            if (areParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

            return answer;
        }

        private boolean areParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
            return (dot2[1] - dot1[1]) * (dot4[0] - dot3[0]) == (dot4[1] - dot3[1]) * (dot2[0] - dot1[0]);
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();

        int[][] dots = {{1, 1}, {2, 2}, {3, 4}, {4, 5}};

        System.out.println(so.solution(dots));

    }
}
