package com.cote.level0;

public class RemoveVowels {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){

                }else{
                    answer += c;
                }
            }


            return answer;
        }
    }
}
