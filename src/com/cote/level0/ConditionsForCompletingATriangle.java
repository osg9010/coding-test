package com.cote.level0;

import java.util.Arrays;

public class ConditionsForCompletingATriangle {
    static class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            // 오름차순 정렬
            Arrays.sort(sides);
            int max = sides[1]; // 11
            int min = sides[0]; // 7

            int low_range = max - min; // 4
            int high_range = max + min; // 18


            answer = high_range - low_range - 1;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{11, 7});
        System.out.println(solution1);
    }
}
