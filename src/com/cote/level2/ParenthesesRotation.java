package com.cote.level2;

import java.util.Stack;

public class ParenthesesRotation {
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            String copy = s;

            if(s.length() % 2 == 1){
                return 0;
            }

            for (int i = 0; i < s.length(); i++) {
                Stack<Character> stack = new Stack<>();
                String str = s.substring(i, s.length()) + s.substring(0, i);

                for (int j = 0; j < str.length(); j++) {
                    char c1 = str.charAt(j);
                    if(stack.isEmpty()){
                        stack.push(c1);
                    }else if(stack.peek() == '{' && c1=='}'){
                        stack.pop();
                    }else if(stack.peek() == '[' && c1==']'){
                        stack.pop();
                    }else if(stack.peek() == '(' && c1==')'){
                        stack.pop();
                    }else{
                     stack.push(c1);
                    }
                }
                if(stack.isEmpty()){
                    answer++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int solution = new Solution().solution("[](){}");
        System.out.println(solution);
    }
}
