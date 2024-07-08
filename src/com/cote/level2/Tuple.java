package com.cote.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple {
   static class Solution {
        public int[] solution(String s) {
            int[] answer = {};
            String[] nums = {};
            List<String> nowN = new ArrayList<>();
            s = s.substring(2,s.length()-2);
            String[] parts = s.split("\\},\\{");

            Arrays.sort(parts,(a,b) -> Integer.compare(a.length(),b.length()));

            answer = new int[parts.length];
            answer[0] = Integer.parseInt(parts[0]);
            nowN.add(parts[0]);

            for (int i = 1; i < parts.length; i++) {
                nums = new String[parts[i].length()];
                nums = parts[i].split(",");
                for (int j = 0; j < nums.length; j++) {
                    if(nowN.contains(nums[j])){
                        continue;
                    }else{
                        nowN.add(nums[j]);
                        answer[i] = Integer.parseInt(nums[j]);
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        int[] solution = so.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
