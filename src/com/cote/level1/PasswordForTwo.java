package com.cote.level1;

public class PasswordForTwo {
    static class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                for (int j = 0; j < index; j++) {
                    c++;
                    if (c > 'z') {
                        c -= 26;  // 알파벳 범위를 벗어났을 경우 'a'로 돌아감
                    }
                    while (skip.contains(String.valueOf(c))) {  // skip에 포함된 문자는 건너뜀
                        c++;
                        if (c > 'z') {
                            c -= 26;  // 알파벳 범위를 벗어났을 경우 다시 'a'로 돌아감
                        }
                    }
                }

                answer += c;
            }
            return answer;
        }

}

    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution("aukks", "abc", 5);
        System.out.println(solution1);
    }
}
