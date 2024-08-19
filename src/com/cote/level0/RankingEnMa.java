package com.cote.level0;

import java.util.*;

public class RankingEnMa {
    class Solution {
        public int[] solution(int[][] score) {
            // 평균 점수를 저장할 배열을 Double 타입으로 선언합니다.
            Double[] avgScore = new Double[score.length];
            int n = score[0].length;    // 과목 수

            // 각 학생의 평균 점수를 계산합니다.
            for (int i = 0; i < score.length; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += score[i][j];  // 각 학생의 모든 과목 점수를 합산합니다.
                }
                avgScore[i] = sum * 1. / n; // 평균 점수를 계산합니다.
            }

            // 결과를 저장할 배열을 선언합니다.
            int[] result = new int[score.length];

            // 평균 점수를 List로 변환하여 내림차순으로 정렬합니다.
            List<Double> list = new ArrayList<>(Arrays.asList(avgScore));
            Collections.sort(list, Collections.reverseOrder());

            // 각 학생의 평균 점수를 기준으로 순위를 매깁니다.
            for (int i = 0; i < avgScore.length; i++) {
                result[i] = list.indexOf(avgScore[i]) + 1; // 순위를 1부터 시작하도록 조정합니다.
            }

            return result; // 순위를 포함한 결과 배열을 반환합니다.
        }
    }
}
