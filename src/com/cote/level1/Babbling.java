package com.cote.level1;

public class Babbling {
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String a = "aya";
            String b = "ye";
            String c = "woo";
            String d = "ma";

            for (int i = 0; i < babbling.length; i++) {
                String bab = babbling[i];

                if(bab.contains(a+a) || bab.contains(b+b)||bab.contains(c+c)||bab.contains(d+d)){
                    continue;
                }

                bab = bab.replaceAll(a," ");
                bab = bab.replaceAll(b," ");
                bab = bab.replaceAll(c," ");
                bab = bab.replaceAll(d," ");
                bab = bab.replaceAll(" ","");



                if(bab.equals("")){
                    answer++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new String[]{"mayaa"});
        System.out.println(solution1);
    }
}
