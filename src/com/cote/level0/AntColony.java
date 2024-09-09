package com.cote.level0;

public class AntColony {
    class Solution {
        public int solution(int hp) {
            int answer = 0;
            int top = 5;
            int mid = 3;


            int topLest = hp / top;
            hp = hp-(topLest * top);

            int midLest = hp / mid;
            hp = hp-(midLest * mid);


            answer = topLest + midLest + hp;

            return answer;
        }
    }
}
