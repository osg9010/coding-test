package com.cote.level0;

import java.util.HashMap;

public class IHateEnglish {
    static class Solution {
        public long solution(String numbers) {
            long answer = 0;
            String bfAnswer = "";
            String nowWords = "";
            HashMap<String, String> stringMap = new HashMap<>();
            stringMap.put("zero", "0");
            stringMap.put("one", "1");
            stringMap.put("two", "2");
            stringMap.put("three", "3");
            stringMap.put("four", "4");
            stringMap.put("five", "5");
            stringMap.put("six", "6");
            stringMap.put("seven", "7");
            stringMap.put("eight", "8");
            stringMap.put("nine", "9");

            for (int i = 0; i < numbers.length(); i++) {
                nowWords += numbers.charAt(i);
                if(stringMap.containsKey(nowWords)) {
                    bfAnswer = bfAnswer + stringMap.get(nowWords);
                    nowWords = "";
                }
            }

            answer = Long.parseLong(bfAnswer);

            return answer;
        }
    }

    public static void main(String[] args) {
        long num = new Solution().solution("onetwothreefourfivesixseveneightnine");
        System.out.println(num);
    }
}
