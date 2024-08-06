package com.cote.level0;

public class Quadrant {
    class Solution {
        public int solution(int[] dot) {
            int answer = 0;
            int i = dot[0];
            int j = dot[1];

            if(i > 0&& j > 0){
                return 1;
            }else if (i < 0 && j > 0){
                return 2;
            }else if(i < 0&& j < 0){
                return 3;
            }else{
                return 4;
            }

        }
    }
}
