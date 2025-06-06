package com.cote.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
 * 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
 * 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 */

public class PrefixSum11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        int sum = 0;

        List<Integer> collect = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] prefixSum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i-1] + collect.get(i-1);
        }

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            sum = 0;
            sum = prefixSum[b]-prefixSum[a-1];
            sb.append(sum+"\n");
        }

        System.out.println(sb.toString());

    }
}

