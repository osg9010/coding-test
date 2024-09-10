package com.cote.level1;

import java.util.Arrays;

public class FoldingBanknotes {
    class Solution {
        public int solution(int[] wallet, int[] bill) {
            int answer = 0;

            Arrays.sort(wallet);
            Arrays.sort(bill);

            if(bill[0] < wallet[0] && bill[1] < wallet[1]){
                return 0;
            }

            while (true){
                if((bill[0] <= wallet[0] && bill[1] <= wallet[1])||(bill[1] <= wallet[0] && bill[0] <= wallet[1])){
                    return answer;
                }

                if(bill[0] > bill[1]){
                    answer++;
                    bill[0] = bill[0]/2;
                }else{
                    answer++;
                    bill[1] = bill[1]/2;
                }

            }
        }
    }
}
