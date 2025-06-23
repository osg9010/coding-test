package com.cote.level0;

public class StringOfN {
    static class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(0,n);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.solution("ProgrammerS123", 11);
        System.out.println(s);
    }
}
