package com.cote.level0;

import java.util.Arrays;

public class RectangularDimensions {
    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            int[] arr1 = new int[dots.length];
            int[] arr2 = new int[dots.length];


            for (int i = 0; i < dots.length; i++) {
                    arr1[i] = dots[i][0];
                    arr2[i] = dots[i][1];
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            answer = Math.abs(arr1[3] - arr1[0]) * Math.abs(arr2[3] - arr2[0]);


            return answer;
        }
    }
}
