package com.cote.level2;

public class CodeProcessing {
   static class Solution {
        public String solution(String code) {
            String answer = "";
            int mode = 0;
            char[] chars = code.toCharArray();
            for(int i = 0 ; i < chars.length;i++){
                if(chars[i] == '1'){
                    mode = mode == 0? 1:0;
                    continue;
                }

                if(mode==0){
                    if(i%2 == 0){
                        answer+=chars[i];
                    }
                }else {
                    if(i%2 != 0){
                        answer+=chars[i];
                    }
                }

            }

            if(answer.equals("") || answer == null|| answer.length()==0){
                return "EMPTY";
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        String result = so.solution("abc1abc1abc");
        System.out.println(result);
    }
}
