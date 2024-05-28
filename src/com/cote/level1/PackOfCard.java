package com.cote.level1;

public class PackOfCard {
    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";
            int j = 0;
            int k = 0;

            for (int i = 0; i < goal.length; i++) {
                if( j <= cards1.length-1 && goal[i].equals(cards1[j])){
                    j++;

                }else if(k <= cards2.length-1 && goal[i].equals(cards2[k])){
                    k++;

                }else {
                    return "No";
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so  = new Solution();
        String solution = so.solution(new String[]{"i", "drink", "water"},new String[]{"want", "to"},new String[]{"i", "want", "to", "drink", "water"});
//        String solution = so.solution(new String[]{"i", "water", "drink"},new String[]{"want", "to"},new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(solution);

    }
}
