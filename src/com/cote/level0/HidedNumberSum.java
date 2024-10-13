package com.cote.level0;

public class HidedNumberSum {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                if(c=='1'){
                    answer+=1;
                }else if(c=='2'){
                    answer+=2;
                }else if(c=='3'){
                    answer+=3;
                }else if(c=='4'){
                    answer+=4;
                }else if(c=='5'){
                    answer+=5;
                }else if(c=='6'){
                    answer+=6;
                }else if(c=='7'){
                    answer+=7;
                }else if(c=='8'){
                    answer+=8;
                }else if(c=='9'){
                    answer+=9;
                }
            }


            return answer;
        }
    }
}
