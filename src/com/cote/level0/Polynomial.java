package com.cote.level0;

public class Polynomial {
    static class Solution {
        public String solution(String polynomial) {
            String answer = "";
            String[] split = polynomial.split("\\+");
            int xSum = 0;
            int sum = 0;

            for (int i = 0; i < split.length; i++) {
                if(split[i].contains("x")) {
                    String x = split[i].replace("x", "").trim();
                    if(x.equals("")) {
                        xSum += 1;
                    } else {
                        xSum += Integer.parseInt(x);
                    }
                } else {
                    sum += Integer.parseInt(split[i].trim());
                }
            }

            if(xSum != 0) {
                answer += xSum == 1 ? "x" : xSum + "x";
            }

            if(sum != 0) {
                if(!answer.isEmpty()) {
                    answer += " + ";
                }
                answer += sum;
            }

            if(answer.isEmpty()) {
                answer = "0";
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution("x + 5");
        System.out.println(solution1);
    }
}
