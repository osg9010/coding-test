package com.cote.level0;

public class ThrowBall {
    static class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;

            int i = 0;
            while (k > 0){
                k--;
                answer = numbers[i];
                i = i+2;
                if(i >= numbers.length){
                    i = i-numbers.length;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{1, 2, 3, 4,5,6}, 5);
        System.out.println(solution1);
    }
}
