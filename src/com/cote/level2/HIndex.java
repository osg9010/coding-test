package com.cote.level2;

import java.util.Arrays;

public class HIndex {
   static class Solution {

           public int solution(int[] citations) {
               int answer = 0;
               Arrays.sort(citations);

               for (int i = 0; i < citations.length; i++) { // 0 1 2 3 4
                   answer = citations.length - i; // 9 8 7 6 5 4 3 2 1
                   if (citations[i] >= answer) { //
                       return answer;
                   }
               }

               return 0;
           }

   }

    public static void main(String[] args) {

        Solution so = new Solution();
        int solution = so.solution(new int[]{ 7,7,7,7,7,7,7,7});
        System.out.println(solution);
    }
}
