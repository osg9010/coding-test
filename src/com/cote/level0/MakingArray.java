package com.cote.level0;

import java.util.ArrayList;

public class MakingArray {
    class Solution {
        public int[] solution(int l, int r) {
            int[] answer = {};
            ArrayList<Integer> integers = new ArrayList<>();

            for (int i = l; i <=r ; i++) {
                if(String.valueOf(i).replaceAll("5","")
                        .replaceAll("0","").equals("")){
                    integers.add(i);
                }
            }
            if(integers.size() == 0){
                return new int[]{-1};
            }
            answer = new int[integers.size()];
            for (int i = 0; i < integers.size(); i++) {
                answer[i] = integers.get(i);
            }

            return answer;
        }
    }
}
