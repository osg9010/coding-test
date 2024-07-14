package com.cote.level1;
import java.util.*;

public class MakingLargeNumbersUsingPairsOfNumbers {
    class Solution {
        public String solution(String X, String Y) {
            int[] xCount = new int[10];
            int[] yCount = new int[10];

            // 각 문자열에서 숫자의 빈도수를 센다
            for (char c : X.toCharArray()) {
                xCount[c - '0']++;
            }
            for (char c : Y.toCharArray()) {
                yCount[c - '0']++;
            }

            StringBuilder answer = new StringBuilder();

            // 9부터 0까지 공통된 숫자를 찾아서 answer에 추가한다
            for (int i = 9; i >= 0; i--) {
                int minCount = Math.min(xCount[i], yCount[i]);
                while (minCount-- > 0) {
                    answer.append(i);
                }
            }

            // 공통된 숫자가 없으면 -1을 반환한다
            if (answer.length() == 0) {
                return "-1";
            }

            // 가장 큰 숫자가 0이면 0을 반환한다
            if (answer.charAt(0) == '0') {
                return "0";
            }

            return answer.toString();
        }
    }
}
