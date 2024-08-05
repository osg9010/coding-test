package com.cote.level1;

public class DartGameKakao {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            int[] ints = new int[3];
            int index = 0;
            for (int i = 0; i < dartResult.length(); i++) {
                char c = dartResult.charAt(i);

                if(Character.isDigit(c)){
                    int num = c-'0';
                    if(Character.isDigit(dartResult.charAt(i+1))){
                        ints[index] = 10;
                        i++;
                    }else{
                        ints[index] = num;
                    }
                }else if(c == 'S'){
                    ints[index] = ints[index];
                    index++;
                }else if(c == 'D'){
                    ints[index] = ints[index]*ints[index];
                    index++;
                }else if(c == 'T'){
                    ints[index] = ints[index]*ints[index]*ints[index];
                    index++;
                }else if(c == '*'){
                    ints[index-1] = ints[index-1]*2;
                    if(index - 2 >= 0){
                        ints[index-2] = ints[index-2] *2;
                    }
                }else if(c == '#'){
                    ints[index-1] = ints[index-1]*-1;
                }
            }

            for (int anInt : ints) {
                answer += anInt;
            }
            return answer;
        }
    }
}
