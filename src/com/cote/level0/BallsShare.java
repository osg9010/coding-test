package com.cote.level0;

import java.math.BigInteger;

public class BallsShare {
    class Solution {
        public int solution(int balls, int share) {
            if(share == balls) return 1;
            BigInteger answer = BigInteger.valueOf(1);

            for (int i = 1; i <= balls; i++) {
                answer =answer.multiply(BigInteger.valueOf(i));
            }

            for (int i = 1; i <= balls-share; i++) {
                answer = answer.divide(BigInteger.valueOf(i));
            }

            for (int i = 1; i <= share; i++) {
                answer = answer.divide(BigInteger.valueOf(i));
            }

            return answer.intValue();
        }
    }
}
