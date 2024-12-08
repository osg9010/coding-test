package com.cote.level0;

import java.util.ArrayList;

public class SeparatedBySpaces {
    class Solution {
        public String[] solution(String my_string) {
            ArrayList<String> strings = new ArrayList<>();
            StringBuilder word = new StringBuilder();

            for (int i = 0; i < my_string.length(); i++) {
                char currentChar = my_string.charAt(i);
                if (currentChar != ' ') {
                    word.append(currentChar); // 단어 추가
                } else {
                    if (word.length() > 0) { // 비어있지 않은 경우만 추가
                        strings.add(word.toString());
                        word.setLength(0); // StringBuilder 초기화
                    }
                }
            }

            // 마지막 단어 추가
            if (word.length() > 0) {
                strings.add(word.toString());
            }

            // ArrayList를 배열로 변환
            return strings.toArray(new String[0]);
        }
    }
}
