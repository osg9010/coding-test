package com.cote.level0;

/**
 *  겹치는 선분의 길이
 *  선분말고 찍힌 점이 1보다 크면 2번지나간것 - 카운트
 */
public class Overlap {

    static class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            int[] pointArr = new int[201];

            for(int i[] : lines){
                int start = i[0]+100;
                int end = i[1]+100;

                for(int k = start ; k < end ; k++){
                    pointArr[k] += 1;
                }
            }

            for (int i : pointArr) {
                if(i > 1)answer++;

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();

        // {0, 1}, {2, 5}, {3, 9}
        // (0, 5}, {1, 10}, {3, 9}
        int solution = so.solution(new int[][]{{1,12}, {3,6}, {2,4}});
        System.out.println(solution);

    }
}
