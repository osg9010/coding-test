package com.cote.level0;

import java.util.*;

public class Mode {
    static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            Map<Integer, Integer> arrMap = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if (arrMap.containsKey(array[i])) {
                    arrMap.put(array[i], arrMap.get(array[i]) + 1);
                } else {
                    arrMap.put(array[i], 1);
                }
            }
            int maxCount = Collections.max(arrMap.values());
            int count = 0;
            int maxCountNumber = 0;

            for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
                if(entry.getValue() == maxCount){
                    maxCountNumber = entry.getKey();
                    count++;
                }
            }

            if(count > 1){
                return -1;
            }
            answer = maxCountNumber;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{1, 2, 2, 3, 4});
        System.out.println(solution1);
    }
}
