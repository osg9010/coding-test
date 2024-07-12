package com.cote.level2;


public class Fatigue {
    static class Solution {
        private int maxDungeons = 0;

        public int solution(int k, int[][] dungeons) {
            boolean[] booleans = new boolean[dungeons.length];
            solution2(k,booleans,dungeons,0);
            return maxDungeons;
        }

        private void solution2(int k, boolean[] booleans, int[][] dungeons, int count) {
            maxDungeons = Math.max(maxDungeons,count);

            for (int i = 0; i < dungeons.length; i++) {
                if(booleans[i]==false && k >= dungeons[i][0]){
                    booleans[i] = true;
                    solution2(k-dungeons[i][1],booleans,dungeons,count+1);
                    booleans[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println(solution1);
    }
}
