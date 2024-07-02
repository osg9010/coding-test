package com.cote.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class OvertimeIndex {
    class Solution {
        public long solution(int n, int[] works) {
            long answer = 0;

            int worksSum = Arrays.stream(works).sum();
            if (worksSum <= n) return 0;

            PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

            for (int work : works) {
                pQ.add(work);
            }

            for (int i = 0; i < n; i++) {
                pQ.add(pQ.poll()-1);
            }

            if(!pQ.isEmpty()){
                for (Integer integer : pQ) {
                    answer+= integer*integer;
                }
            }

            return answer;
        }
    }
}
