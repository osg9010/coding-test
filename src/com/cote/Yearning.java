package com.cote;

import java.util.HashMap;
import java.util.Map;

public class Yearning {
    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            Map<String,Integer> score = new HashMap<>();
            int point = 0;

            for(int i = 0; i < name.length;i++){
                score.put(name[i],yearning[i]);
            }
            for(int i = 0 ; i < photo.length; i++){
                point = 0;
                for(int j = 0 ; j < photo[i].length;j++){
                    if(score.get(photo[i][j]) != null){
                        point += score.get(photo[i][j]);
                    }
                }
                answer[i] = point;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.solution(new String[]{"may", "kein", "kain", "radi"},new int[]{5,10,1,3},new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}}));
    }
}
