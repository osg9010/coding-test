package com.cote.level3;

import java.util.*;
import java.util.stream.Collectors;

public class WordsChange {
    static class Solution {
        class Node{
            String name;
            int call;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCall() {
                return call;
            }

            public void setCall(int call) {
                this.call = call;
            }

            public Node(String name, int call){
                this.name = name;
                this.call = call;
            }
        }

        public int solution(String begin, String target, String[] words) {
            int answer = 0;

            List<String> collect = Arrays.stream(words).collect(Collectors.toList());
            Queue<Node> nodes = new LinkedList<>();

            nodes.add(new Node(begin,0));

            if(!collect.contains(target)){
                return 0;
            }

            while (!nodes.isEmpty()) {

                Node poll = nodes.poll();
                String name = poll.getName();
                int call = poll.getCall();

                if(name.equals(target)){
                    return call;
                }

                for (int i = 0; i < collect.size(); i++) {
                    if(oneDiff(name,collect.get(i))){
                        nodes.add(new Node(collect.get(i),call+1));
                        collect.remove(i);
                    }
                }

            }
            return answer;
        }

        public boolean oneDiff(String a, String b){
            int count = 0;
            boolean returnval = false;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != b.charAt(i)){
                    count++;
                }

                if(count > 2){
                    returnval = false;
                    break;
                }
            }

            if(count == 1){
                returnval = true;
            }

            return returnval;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println(solution1);
    }
}
