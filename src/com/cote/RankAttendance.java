package com.cote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *  전국 대회 선발 고사 t/f 1등인지 인덱스
 */
public class RankAttendance {
    static class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            int answer = 0;
            Map<Integer,Integer> rankMap = new HashMap<>();
            ArrayList<Integer> sort = new ArrayList<>();
            for(int i = 0 ; i< rank.length;i++) rankMap.put(rank[i],i);
            for(int i = 0 ; i< rank.length;i++) {
                if(attendance[i])
                    sort.add(rank[i]);
            }
            Collections.sort(sort);
            answer = rankMap.getOrDefault(sort.get(0),1)*10000+rankMap.getOrDefault(sort.get(1),1)*100+rankMap.getOrDefault(sort.get(2),1);

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int solution = so.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false});
        System.out.println(solution);
    }
}
