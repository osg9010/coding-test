package com.cote.level1;

import java.util.Arrays;

public class FruitSeller {
    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            int[] box = new int[m];
            Arrays.sort(score);
            int j = 0;
            for (int i = 0; i < score.length; i++) {

                box[j] = score[score.length-1-i];
                j++;
                if(j==m){
                    j = 0;
                    answer += box[m-1]*m;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int solution = so.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(solution);
    }
}
