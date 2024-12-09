package com.cote.baekjoon;

import java.util.*;

public class StudyVoca1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // 소문자 또는 대문자 구별 없이 처리하려면 모두 소문자로 변환
        s = s.toLowerCase();

        // 문자 빈도수 계산
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> cMap = new HashMap<>();
        for (char c : chars) {
            cMap.put(c, cMap.getOrDefault(c, 0) + 1);
        }

        // 빈도수를 기준으로 가장 큰 값 찾기
        int maxFreq = 0;
        for (int freq : cMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // 가장 큰 빈도수를 가진 문자들 찾기
        int count = 0;
        char result = '?';
        for (Map.Entry<Character, Integer> entry : cMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                count++;
                result = entry.getKey();
            }
        }

        // 가장 많이 나온 문자가 두 개 이상이면 "?" 출력, 그렇지 않으면 그 문자 출력
        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(Character.toUpperCase(result));
        }
    }

}
