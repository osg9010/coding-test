package com.cote.level0;

public class RemoveLetter {
    class Solution {
        public String solution(String my_string, String letter) {
            String s = my_string.replaceAll(letter, "");

            return s;
        }
    }
}
