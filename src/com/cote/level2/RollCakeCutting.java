package com.cote.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeCutting {

   static class Solution {
        public int solution(int[] topping) {
            int answer = 0;

            // 각 토핑이 왼쪽과 오른쪽에서 얼마나 남아 있는지 체크하는 Map
            Map<Integer, Integer> leftMap = new HashMap<>();
            Map<Integer, Integer> rightMap = new HashMap<>();

            // 초기에는 모든 토핑이 오른쪽에 있다고 가정
            for (int top : topping) {
                rightMap.put(top, rightMap.getOrDefault(top, 0) + 1);
            }

            // 왼쪽 집합의 크기와 오른쪽 집합의 크기를 비교
            for (int top : topping) {
                // 현재 토핑을 오른쪽에서 제거하고 왼쪽으로 이동
                leftMap.put(top, leftMap.getOrDefault(top, 0) + 1);
                rightMap.put(top, rightMap.get(top) - 1);

                if (rightMap.get(top) == 0) {
                    rightMap.remove(top);
                }

                // 두 집합의 크기가 같다면 answer 증가
                if (leftMap.size() == rightMap.size()) {
                    answer++;
                }
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
        System.out.println(solution1);
    }
}
