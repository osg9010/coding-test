package com.cote.level0;

import java.util.ArrayList;

public class DivisorAsc {
    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if(n%i == 0){
                    divisors.add(i);
                }
            }

            return divisors.stream().mapToInt(a -> a.intValue()).toArray();
        }
    }
}
