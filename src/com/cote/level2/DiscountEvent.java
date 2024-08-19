package com.cote.level2;

import java.util.*;

public class DiscountEvent {
    static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            Map<String,Integer> wantMap = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                wantMap.put(want[i],number[i]);
            }

            for (int i = 0; i < discount.length; i++) {
                Map<String,Integer> nowMap = (Map<String, Integer>) ((HashMap<String, Integer>) wantMap).clone();
                String[] strings = Arrays.copyOfRange(discount, i, i + 10);

                for (int j = 0; j < 10 ; j++) {
                    if(!Arrays.asList(strings).containsAll(Arrays.asList(want))){
                        break;
                    }
                    if(nowMap.get(strings[j]) == null){
                        break;
                    }
                    int num = nowMap.get(strings[j]) - 1;

                    if(num > 0){
                        nowMap.put(strings[j],num);
                    }else{
                        nowMap.remove(strings[j]);
                    }


                }

                if(nowMap.size() == 0){
                    answer++;
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
        System.out.println(solution1);

    }
}
