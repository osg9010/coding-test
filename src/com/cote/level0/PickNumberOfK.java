package com.cote.level0;

import java.util.ArrayList;

public class PickNumberOfK {
    static class Solution {
        public int[] solution(int[] arr, int k) {
            int[] answer = new int[k];
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(!integers.contains(arr[i])) {
                    integers.add(arr[i]);
                }
                if(integers.size() == k) break;
            }

            for (int j = 0; j < k; j++) {
                if(j < integers.size()) {
                    answer[j] = integers.get(j);
                }else{
                    answer[j]  = -1;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] solution = new Solution().solution(new int[]{0, 1, 1, 2, 2, 3}, 3);
        for (int i : solution) {
            System.out.print(i);
        }
    }
}
