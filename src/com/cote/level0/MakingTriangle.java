package com.cote.level0;

import java.util.Arrays;

public class MakingTriangle {
    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            Arrays.sort(sides);

            answer = sides[2] < sides[0]+sides[1]? 1 : 2;
            return answer;
        }
    }
}
