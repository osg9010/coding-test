package com.cote.level0;

public class MaxChicken {
    static class Solution {
        public int solution(int chicken) {
            int answer = 0;
            int coupon = chicken;

            while (coupon >= 10){
                answer += coupon / 10;
                coupon = (coupon/10)+(coupon%10);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(100);
        System.out.println(solution1);
    }
}
