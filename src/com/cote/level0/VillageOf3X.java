package com.cote.level0;

public class VillageOf3X {
   static class Solution {
       public int solution(int n) {
           int answer = 0;
           int[] arr = new int[n];
           int number = 1; //
           for (int i = 0; i < n; i++) {
               while (true) {
                   if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                       number++;
                   } else {
                       arr[i] = number;
                       number++;
                       break;
                   }
               }
           }

           answer = arr[n-1];
           return answer;
       }
   }


    public static void main(String[] args) {
        Solution so = new Solution();
        int solution = so.solution(40);
        System.out.println(solution);
    }
}
