package com.cote.level0;

public class OddSort {
    static class Solution {
        public int[] solution(int n) {
            int index = n % 2 == 0? n/2 : n/2+1;
            int[] answer = new int[index];
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if(i % 2 != 0){
                    answer[count++] = i;
                }
            }
            return answer;
        }
    }
}
