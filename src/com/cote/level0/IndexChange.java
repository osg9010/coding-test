package com.cote.level0;

public class IndexChange {
    static class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer ;
            char[] chars = my_string.toCharArray();
            char temp = chars[num1];
            chars[num1] = chars [num2];
            chars[num2] = temp;
            answer = String.copyValueOf(chars);
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String hello = solution.solution("hello", 2, 4);
        for (int i = 0; i < hello.length(); i++) {
            System.out.print(hello.charAt(i));
        }

    }
}
