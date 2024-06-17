package com.cote.level0;

import java.util.Arrays;

public class MiddleNum {
    static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            Arrays.sort(array);

            if(array.length % 2 == 1){
                answer = array[array.length/2];
            }else{
                answer = array[array.length/2-1];
            }

            return answer;
        }
    }
}
