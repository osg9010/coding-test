package com.cote.level0;

import java.util.Arrays;

public class MakingMaxNum {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            Arrays.sort(numbers);
            answer = numbers[numbers.length - 1]*numbers[numbers.length - 2];
            return answer;
        }
    }
}
