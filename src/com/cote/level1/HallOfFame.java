package com.cote.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> scores = new ArrayList<Integer>();

            for (int i = 0; i < score.length; i++) {
                if(i == 0){
                    scores.add(score[i]);
                    answer[i] = scores.get(0);
                }else{
                    if(i >= k){
                        if(scores.get(0) < score[i]){
                            scores.remove(scores.get(0));
                            scores.add(score[i]);
                            Collections.sort(scores);
                        }
                        answer[i] = scores.get(0);
                    }
                    else{
                        scores.add(score[i]);
                        Collections.sort(scores);
                        answer[i] = scores.get(0);
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int[] solution = so.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});

        for (int i : solution) {
            System.out.print(i);

        }

    }
}
