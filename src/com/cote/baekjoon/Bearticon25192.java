package com.cote.baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Bearticon25192 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int count = 0;
        HashSet<String> members = new HashSet<>();
        String now = "";
        for (int i = 0; i < a; i++) {
            now = in.nextLine();
            if(now.equals("ENTER")){
                members.clear();
            }else{
                if(members.contains(now)){

                }else{
                    count++;
                    members.add(now);
                }
            }
        }
        System.out.println(count);
    }
}
