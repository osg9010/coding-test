package com.cote;

/**
 *  최소공배수 문제
 */
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

public class Lcm {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int so = solution.solution(new int[]{2,6,8,14});
        System.out.println(so);

    }
}
