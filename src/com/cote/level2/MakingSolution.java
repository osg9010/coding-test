package com.cote.level2;

import java.util.Map;
import java.util.TreeMap;

public class MakingSolution {
   static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};

            Map<Integer, Integer> clear = new TreeMap<>();

            int times = 0;
            int thistime = 0;

            for (int i = 0; i < progresses.length; i++) {
                if(progresses[i] + speeds[i]*times >= 100){
                    if(clear.containsKey(thistime)){
                        clear.put(thistime,clear.get(thistime)+1);
                    }
                    continue;
                }else {
                    times = 0;
                    while (progresses[i] < 100) {
                        progresses[i] += speeds[i];
                        times++;
                    }
                }
                thistime++;
                clear.put(thistime,1);
            }
            answer = new int[clear.size()];
            times = 0;
            for (Integer i : clear.keySet()) {
                answer[times++] = clear.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        for (int i : solution1) {
            System.out.println(i);
        }

    }
}
