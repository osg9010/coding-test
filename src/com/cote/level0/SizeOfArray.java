package com.cote.level0;

public class SizeOfArray {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for (int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }

            return answer;
        }
    }
}
