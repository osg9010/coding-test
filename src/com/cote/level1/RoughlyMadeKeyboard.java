package com.cote.level1;

public class RoughlyMadeKeyboard {
    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            for (int i = 0; i < targets.length; i++) {
                String target = targets[i];
                for (char c : target.toCharArray()) {
                    int minVal = Integer.MAX_VALUE;
                    for (String s : keymap) {
                       int idx = s.indexOf(c);
                        if(idx != -1 && idx < minVal){
                            minVal = idx;
                        }
                    }
                    if (minVal < Integer.MAX_VALUE && answer[i] != -1) {
                        answer[i] += minVal + 1;
                    } else {
                        answer[i] = -1;
                    }
                }

            }
            return answer;
        }
    }
}
