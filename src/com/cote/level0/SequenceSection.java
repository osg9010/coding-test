package com.cote.level0;

public class SequenceSection {
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];

            int s = 0;
            int e = 0;
            int k = 0;
            int n = 0;
            int min = 1000001;


            for (int i = 0; i < queries.length; i++) {
                s = queries[i][0];
                e = queries[i][1];
                k = queries[i][2];
                min = 1000001;
                int count = 0;
                for(int j = s; j < e + 1; j++) {
                    if(arr[j] > k) {
                        if(min > arr[j]) {
                            min = arr[j];
                        }
                    } else {
                        count++;
                    }
                }
                if(count == e - s + 1) {
                    answer[i] = -1;
                } else {
                    answer[i] = min;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
        for (int a : solution1) {
            System.out.print(a);
        }
    }
}
