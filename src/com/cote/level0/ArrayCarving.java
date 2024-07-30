package com.cote.level0;

import java.util.Arrays;

public class ArrayCarving {
   static class Solution {
        public int[] solution(int[] arr, int[] query) {
            for(int i =0; i<query.length; i++) {
                if(i % 2 == 0) {
                    arr = Arrays.copyOfRange(arr, 0, query[i]+1);
                }else {
                    arr = Arrays.copyOfRange(arr, query[i], arr.length);
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{4,5,4}, new int[]{1,0});
        for (int i : solution1) {
            System.out.println(i);
        }
    }
}
