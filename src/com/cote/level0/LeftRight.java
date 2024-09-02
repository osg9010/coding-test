package com.cote.level0;

public class LeftRight {
    class Solution {
        public String[] solution(String[] str_list) {
            String[] answer = {};

            String s = str_list.toString();
            if(!s.contains("l") && !s.contains("r")){
                return answer;
            }

            for (int i = 0; i < str_list.length; i++) {

                if(str_list[i].equals("l")){
                    answer = new String[i];
                    for (int j = 0; j < i; j++) {
                        answer[j] = str_list[j];
                    }

                    break;

                } else if(str_list[i].equals("r")){
                    answer = new String[str_list.length-i-1];
                    int index = 0;
                    for (int j = i+1; j < str_list.length; j++) {
                        answer[index] = str_list[j];
                        index++;
                    }
                    break;
                }

            }

            return answer;
        }
    }
}
