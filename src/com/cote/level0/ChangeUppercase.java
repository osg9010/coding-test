package com.cote.level0;

public class ChangeUppercase {
    class Solution {
        public String solution(String my_string, String alp) {
            String answer = my_string.replaceAll(alp,alp.toUpperCase());
            return answer;
        }
    }
}
