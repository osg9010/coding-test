package com.cote.level1;

import java.util.*;

public class LottoGame {
    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int zeroCount = 0;
            int score = 0;

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,6);
            map.put(1,6);
            map.put(2,5);
            map.put(3,4);
            map.put(4,3);
            map.put(5,2);
            map.put(6,1);



            for (int i = 0; i < lottos.length ; i++) {
                if(lottos[i] == 0){
                    zeroCount++;
                }
            }

            if(zeroCount == 6){
                return new int[]{1,6};
            }

            for (int i = 0; i < win_nums.length; i++) {
                for (int j = 0; j < lottos.length; j++) {

                    if(win_nums[i] == lottos[j]){
                        score ++;
                    }

                }
            }

            switch (score){
                case 0 : answer[1] = map.get(0) ;
                    answer[0] = map.get(0+zeroCount);
                    break;

                case 1: answer[1] = map.get(1) ;
                        answer[0] = map.get(1+zeroCount);
                        break;
                case 2:
                    answer[1] = map.get(2) ;
                    answer[0] = map.get(2+zeroCount);
                    break;
                case 3:
                    answer[1] = map.get(3) ;
                    answer[0] = map.get(3+zeroCount);
                    break;
                case 4:
                    answer[1] = map.get(4) ;
                    answer[0] = map.get(4+zeroCount);
                    break;
                case 5:
                    answer[1] = map.get(5) ;
                    answer[0] = map.get(5+zeroCount);
                    break;
                case 6:
                    answer[1] = map.get(6);
                    answer[0] = map.get(6+zeroCount);
                    break;
            }


            return answer;
        }
    }
}
