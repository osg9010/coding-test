package com.cote.level1;

public class ColorOfTheNeighboringSpace {
    static class Solution {
        public int solution(String[][] board, int h, int w) {
            int answer = 0;
            String s = board[h][w];

            if (h > 0) {
                if (board[h - 1][w].equals(s)) answer++;
            }
            if (h != board.length - 1) {
                if (board[h + 1][w].equals(s)) answer++;
            }
            if (w > 0) {
                if (board[h][w - 1].equals(s)) answer++;
            }
            if (w != board.length - 1) {
                if (board[h][w + 1].equals(s)) answer++;
            }
            return answer;
        }
    }
}

