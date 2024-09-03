package com.cote.level0;

public class PizzaShare2 {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            while ((answer*6)%n != 0){
                answer++;
            }

            return answer;
        }
    }
}
