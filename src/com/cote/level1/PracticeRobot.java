package com.cote.level1;

public class PracticeRobot {
    static class Solution {
        public int[] solution(String command) {
            int[] answer = new int[2];

            int now = 0;
            int x = 0;
            int y = 0;

            for (int i = 0; i < command.length(); i++) {
                char c = command.charAt(i);
                if(now == 4){
                    now = 0;
                }else if(now == -1){
                    now = 3;
                }

                if(c == 'R'){
                    now++;
                    continue;
                }else if(c == 'L'){
                    now--;
                    continue;
                }else if(c == 'G'){
                    switch (now){
                        case 0: y++;
                        break;
                        case 1: x++;
                        break;
                        case 2: y--;
                        break;
                        case 3: x--;
                        break;
                    }
                    continue;
                }else if(c == 'B'){
                    switch (now){
                        case 0: y--;
                            break;
                        case 1: x--;
                            break;
                        case 2: y++;
                            break;
                        case 3: x++;
                            break;
                    }
                    continue;
                }
            }

            answer[0] = x;
            answer[1] = y;

            return answer;
        }
    }
}
