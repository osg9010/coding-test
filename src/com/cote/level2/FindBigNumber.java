package com.cote.level2;

import java.util.Stack;

public class FindBigNumber {
        static class Solution {
            public int[] solution(int[] numbers) {
                int[] answer = new int[numbers.length];
                Stack<Integer> stack = new Stack<>(); // 인덱스를 저장할 스택

                for (int i = 0; i < numbers.length; i++) {
                    // 스택이 비어있지 않고, 현재 숫자가 스택에 저장된 인덱스의 숫자보다 크면
                    while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                        answer[stack.pop()] = numbers[i]; // 그 인덱스에 대한 답을 현재 숫자로 설정
                    }
                    stack.push(i); // 현재 인덱스를 스택에 저장
                }

                // 더 큰 숫자를 찾지 못한 인덱스에 대해 -1 설정
                while (!stack.isEmpty()) {
                    answer[stack.pop()] = -1;
                }

                return answer;
            }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{2, 3, 3, 5});
        for (int i = 0; i < solution1.length; i++) {
            System.out.print(solution1[i]);
        }
    }
}
