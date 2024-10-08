package com.cote.level0;

public class AillenCode {
   static class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 2;
            int count = spell.length;

            for (int i = 0; i < dic.length; i++) {
                String s = dic[i];
                count = spell.length;
                for (int j = 0; j < spell.length; j++) {
                    if(s.contains(spell[j])){
                        s=s.replaceFirst(spell[j],"");
                        count--;
                    }
                }
                if(s.equals("") && count == 0){
                    return 1;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
        System.out.println(solution1);
    }
}
