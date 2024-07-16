package com.cote.level1;

import java.util.Arrays;
import java.util.Comparator;

public class FailureRate {
    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            double[] failureRates = new double[N];

            // 각 스테이지 별로 실패율 계산
            for (int i = 1; i <= N; i++) {
                int totalPlayers = 0;
                int failedPlayers = 0;

                // 현재 스테이지에 머물러 있는 플레이어 수와 실패한 플레이어 수 계산
                for (int j = 0; j < stages.length; j++) {
                    if (stages[j] >= i) {
                        totalPlayers++;
                    }
                    if (stages[j] == i) {
                        failedPlayers++;
                    }
                }

                // 실패율 계산
                if (totalPlayers == 0) {
                    failureRates[i - 1] = 0; // 스테이지에 도달한 플레이어가 없는 경우
                } else {
                    failureRates[i - 1] = (double) failedPlayers / totalPlayers;
                }
            }

            // 실패율 기준으로 스테이지 정렬
            Integer[] stageNumbers = new Integer[N];
            for (int i = 0; i < N; i++) {
                stageNumbers[i] = i + 1;
            }

            Arrays.sort(stageNumbers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (failureRates[o1 - 1] == failureRates[o2 - 1]) {
                        return o1.compareTo(o2); // 실패율이 같으면 스테이지 번호 기준 오름차순 정렬
                    } else {
                        return Double.compare(failureRates[o2 - 1], failureRates[o1 - 1]); // 실패율 내림차순 정렬
                    }
                }
            });

            // 정렬된 스테이지 번호 배열을 answer에 저장
            for (int i = 0; i < N; i++) {
                answer[i] = stageNumbers[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        for (int i : solution1) {
            System.out.println(i);
        }
    }
}
