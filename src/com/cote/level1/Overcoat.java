package com.cote.level1;

public class Overcoat {
    static class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int currentEnd = 0;  // 현재 페인트의 끝 지점을 저장할 변수

            for (int i = 0; i < section.length; i++) {
                if (section[i] > currentEnd) {  // 현재 페인트의 끝 지점보다 큰 섹션이 나오면 덧칠 시작
                    answer++;  // 덧칠 횟수 증가
                    currentEnd = section[i] + m - 1;  // 새롭게 페인트한 구간의 끝 지점
                }
            }

            return answer;
        }
    }
}
