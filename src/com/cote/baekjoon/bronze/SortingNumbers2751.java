package com.cote.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class SortingNumbers2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers); // 오름차순 정렬

        for (int num : numbers) {
            bw.write(num + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
