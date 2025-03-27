package com.cote.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class IsVPS9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        Stack<Integer> strings = new Stack<>();
        for (int i = 0; i < a; i++) {
            String string = in.nextLine();
            strings.clear();
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if(c=='('){
                    strings.push(1);
                }else{
                    if(strings.empty()){
                        System.out.println("NO");
                        break;
                    }else{
                        strings.pop();
                    }
                }
                if(j==string.length()-1){
                    if(strings.empty()){
                        System.out.println("YES");
                    }
                }
            }
        }

    }
}
