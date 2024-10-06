package com.cote.level1;


public class PressKeyPad {
   static class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int lastL = 10;
            int lastR = 12;
            int lDiff = 0;
            int rDiff = 0;

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == 0) numbers[i] = 11;
            }

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == 1||numbers[i] == 4||numbers[i] == 7){
                    answer += "L";
                    lastL = numbers[i];
                }else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 9){
                    answer += "R";
                    lastR = numbers[i];
                }else{
                    lDiff = Math.abs(numbers[i]-lastL);
                    rDiff = Math.abs(numbers[i]-lastR);

                    lDiff = lDiff/3 + lDiff%3;
                    rDiff = rDiff/3 + rDiff%3;

                    if(lDiff > rDiff){
                        answer += "R";
                        lastR = numbers[i];
                    }else if(lDiff < rDiff){
                        answer += "L";
                        lastL = numbers[i];
                    }else{
                        if(hand.equals("right")){
                            answer += "R";
                            lastR = numbers[i];
                        }else{
                            answer += "L";
                            lastL = numbers[i];
                        }
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String right = solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
        System.out.println(right);
    }
}
