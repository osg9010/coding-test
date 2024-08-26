package com.cote.level1;

public class SplitWords {
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            int first = 0;
            int elses = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                first ++;

                while (first != elses){
                    i++;

                    if(i >= s.length()){
                        return answer+1;
                    }

                    if(s.charAt(i) == c){
                        first++;
                    }else{
                        elses ++;
                    }
                }
                answer ++;
                first = 0;
                elses = 0;

            }
            return answer;
        }
    }
}
