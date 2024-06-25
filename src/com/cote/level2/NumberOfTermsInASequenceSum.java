package com.cote.level2;

import java.util.HashSet;
import java.util.Set;

public class NumberOfTermsInASequenceSum {
    static class Solution {
        public int solution(int[] elements) {
            int answer = 0;

            Set<Integer> numSet = new HashSet<>();

            for(int i =1; i<=elements.length; i++) {

                for(int j =0; j<=elements.length; j++) {

                    int sum =0;

                    for(int k=j; k<j+i; k++) {

                        sum+=elements[k%elements.length];
                    }
                    numSet.add(sum);
                }
            }
            answer = numSet.size();
            return answer;
        }
    }
}
