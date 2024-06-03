package com.cote.level1;

import java.util.Arrays;
import java.util.Comparator;

public class DataAnalytics {
    static class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            int target = 0;

            if(ext.equals("code")){
                target = 0;
            }
            else if(ext.equals("date")){
                target = 1;
            }
            else if(ext.equals("maximum")){
                target = 2;
            }
            else if(ext.equals("remain")){
                target = 3;
            }

            int count = 0;
            for (int[] row : data) {
                if (row[target] < val_ext) {
                    count++;
                }
            }

            // Create the answer array
            int[][] answer = new int[count][4];
            int index = 0;
            for (int[] d : data) {
                if(d[target] < val_ext){
                    answer[index] = d;
                    index++;
                }

            }
            Arrays.sort(answer, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(sort_by.equals("code")){
                        return o1[0]-o2[0];
                    }
                    else if(sort_by.equals("date")){
                        return o1[1]-o2[1];
                    }
                    else if(sort_by.equals("maximum")){
                        return o1[2]-o2[2];
                    }
                    else{
                        return o1[3]-o2[3];
                    }
                }
            });
            return answer;
        }
    }

    public static void main(String[] args) {

    }
}
