package com.cote.level1;

import java.util.*;

public class GymClothes {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n-lost.length;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if(reserve[j] == lost[i]){
                        answer++;
                        reserve[j] = -1;
                        lost[i] = -1;
                        break;
                    }
                }
            }

            for (int i = 0; i < lost.length; i++) {
                if(lost[i] == -1)continue;
                for (int j = 0; j < reserve.length; j++) {
                    if(reserve[j] == -1)continue;
                    if(Math.abs(reserve[j] - lost[i]) == 1){
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
            return answer > n? n : answer;
        }
    }
}
