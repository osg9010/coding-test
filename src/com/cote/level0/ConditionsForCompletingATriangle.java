package com.cote.level0;

import java.util.Arrays;

public class ConditionsForCompletingATriangle {
    static class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            Arrays.sort(sides);
            int a = sides[0];
            int b = sides[1];
            int c = 1;

            while (a+c>b){
                answer++;
                c++;
            }

            while (a+b >c){
                answer++;
            }



            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution();
        System.out.println(solution1);
    }
}
