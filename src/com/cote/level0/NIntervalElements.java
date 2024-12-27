package com.cote.level0;

public class NIntervalElements {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[1+(num_list.length-1)/n];

            answer[0] = num_list[0];
            int index = 1;
            for (int i = 1; i < num_list.length; i++) {
                if(i%n==0){
                    answer[index++] = num_list[i];
                }
            }

            return answer;
        }
    }
}
