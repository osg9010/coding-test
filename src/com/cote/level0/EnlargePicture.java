package com.cote.level0;

public class EnlargePicture {
    static class Solution {
        public String[] solution(String[] picture, int k) {
            String[] answer = new String[picture.length*k];

            for (int i = 0; i < picture.length; i++) {
                String s = picture[i];
                String now = "";
                for (int j = 0; j < s.length(); j++) {
                    for (int l = 0; l < k; l++) {
                        now += s.charAt(j);
                    }
                }
                for (int j = i*k; j < i*k+k; j++) {
                    answer[j] = now;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] solution1 = solution.solution(new String[]{"x.x", ".x.", "x.x"}, 2);
    }
}
