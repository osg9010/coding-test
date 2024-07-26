package com.cote.level0;

public class OXQuiz {
    static class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {
                String now = quiz[i];
                String[] s = now.split(" ");
                String delimeter = s[1];
                int num1 = Integer.parseInt(s[0]);
                int num2 = Integer.parseInt(s[2]);
                int num3 = Integer.parseInt(s[4]);
                if(delimeter.equals("+")){
                    if(num1 + num2 == num3){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                }else{
                    if(num1 - num2 == num3){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }

                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        String[] solution = so.solution(new String[]{"-3 - -4 = -3", "5 + 6 = 11"});
        for (String s : solution) {
            System.out.println(s);
        }

    }
}
