package com.cote.level0;

public class CharactorCoordinate {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = new int[2];
            answer[0] = 0;
            answer[1] = 0;

            int top = (board[1]-1) / 2;
            int bottom = -top;
            int right = (board[0]-1) / 2;
            int left = -right;

            for (int i = 0; i < keyinput.length; i++) {
                if(keyinput[i].equals("up")){
                    answer[1] = answer[1]+1 > top? top : answer[1]+1;
                }else if(keyinput[i].equals("down")){
                    answer[1] = answer[1]-1 < bottom? bottom : answer[1]-1;
                }else if(keyinput[i].equals("left")){
                    answer[0] = answer[0]-1 < left? left : answer[0]-1;
                }else if(keyinput[i].equals("right")){
                    answer[0] = answer[0]+1 > right? right : answer[0]+1;
                }
            }
            return answer;
        }
    }
}
