package com.cote;

import java.util.Arrays;
import java.util.Comparator;
public class BigNum {

    static class Solution {
        public String solution(int[] numbers) {
            // 정수 배열을 문자열 배열로 변환
            String[] strNumbers = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                strNumbers[i] = String.valueOf(numbers[i]);
            }
            // 문자열 배열을 정렬
            Arrays.sort(strNumbers, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) { // 3 30 31
                    String combination1 = s1 + s2;
                    String combination2 = s2 + s1;
                    // 내림차순 정렬
                    return combination2.compareTo(combination1);
                }
            });

            // 배열을 이어 붙여 결과 생성
            StringBuilder sb = new StringBuilder();
            for (String str : strNumbers) {
                sb.append(str);
            }

            // 배열이 모두 0인 경우를 처리
            if (sb.charAt(0) == '0') {
                return "0";
            }

            return sb.toString();
        }
    }


    public static void main(String[] args) {
       Solution so = new Solution();
        String solution = so.solution(new int[]{3, 30,31});
        System.out.println(solution);
    }
}
