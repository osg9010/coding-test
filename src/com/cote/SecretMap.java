package com.cote;

public class SecretMap {
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String s1, s2;
            String ans = "";
            int count;
            for (int i = 0; i < n; i++) {
                s1 = decimalToBinary(arr1[i], n);
                s2 = decimalToBinary(arr2[i], n);
                count = 0;
                ans = "";
                while (count < n) {
                    if (s1.charAt(count) == '1' || s2.charAt(count) == '1') {
                        ans += "#";
                    } else {
                        ans += " ";
                    }
                    count++;
                }
                answer[i] = ans;
            }

            return answer;
        }

        public static String decimalToBinary(int decimalNumber, int desiredLength) {
            StringBuilder binary = new StringBuilder();

            // 0인 경우 예외 처리
            if (decimalNumber == 0) {
                while (binary.length() < desiredLength) {
                    binary.insert(0, "0");
                }
                return binary.toString();
            }

            // 정수를 이진수로 변환하여 문자열에 추가
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2; // 2로 나눈 나머지
                binary.insert(0, remainder); // 나머지를 이진수 문자열의 앞쪽에 추가
                decimalNumber = decimalNumber / 2; // 몫을 다시 2로 나눔
            }

            // 원하는 길이만큼 0으로 채우기
            while (binary.length() < desiredLength) {
                binary.insert(0, "0");
            }

            return binary.toString();
        }
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        String[] solution = so.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        for (String s : solution) {
            System.out.println(s);
        }
    }
}
