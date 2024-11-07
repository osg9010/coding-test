package com.cote.level0;

public class MakingSquare {
    class Solution {
        public int[][] solution(int[][] arr) {
            int[][] answer;

            if(arr.length > arr[0].length){
                answer = new int[arr.length][arr.length];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        answer[i][j] = arr[i][j];
                    }
                    answer[i][arr.length-1] = 0;
                }

            }else{
                answer = new int[arr[0].length][arr[0].length];
                for (int i = 0; i < arr[0].length; i++) {
                    if(i <= arr.length-1){
                        for (int j = 0; j < arr[i].length; j++) {
                            answer[i][j] = arr[i][j];
                        }
                    }else{
                        for (int j = arr.length-1; j < arr[0].length ; j++) {
                            answer[i][j] = 0;
                        }
                    }
                }
            }

            return answer;
        }
    }
}
