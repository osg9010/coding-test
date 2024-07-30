package com.cote.level0;

import java.util.*;

public class StrangeSort {
    static class Solution {
        public int[] solution(int[] numlist, int n) {
            int[] answer = new int[numlist.length];
            Integer[] numArray = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
            List<Integer> ints = Arrays.asList(numArray);
            Collections.sort(ints, (o1, o2) -> {
               int no1 = Math.abs(n-o1);
               int no2 = Math.abs(n-o2);

               if(no1 != no2){
                   return Integer.compare(no1,no2);
               }else{
                   return o2-o1;
               }
            });

            for (int i = 0; i < ints.size(); i++) {
                answer[i] = ints.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{1, 2, 3, 4}, 3);
        for (int i : solution1) {
            System.out.println(i);
        }

    }
}
