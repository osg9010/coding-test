package com.cote.level0;

public class Spiral {
    public static class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            int value = 1;
            int row = 0;
            int col = 0;
            int direction = 0;

            while(value <= n*n) {
                answer[row][col] = value++;

                if(direction == 0) {
                    if(col == n-1 || answer[row][col+1] != 0) {
                        direction = 1;
                        row++;
                    } else {
                        col++;
                    }
                } else if(direction == 1) {
                    if(row == n -1 || answer[row+1][col] != 0) {
                        direction = 2;
                        col--;
                    } else {
                        row++;
                    }
                } else if(direction == 2) {
                    if(col == 0 || answer[row][col-1] != 0) {
                        direction = 3;
                        row--;
                    } else {
                        col--;
                    }
                } else if(direction == 3) {
                    if(row == 0 || answer[row-1][col] != 0) {
                        direction = 0;
                        col++;
                    } else {
                        row--;
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int[][] solution = so.solution(4);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.println(solution[i][j]);
            }

        }


    }
}
