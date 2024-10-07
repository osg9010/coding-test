package com.cote.level0;

public class DoLogin {
    class Solution {
        public String solution(String[] id_pw, String[][] db) {
            String answer = "";
//            login, wrong pw, fail
            String id = id_pw[0];
            String pw = id_pw[1];
            for (int i = 0; i <db.length ; i++) {
               if(db[i][0].equals(id)){
                   if(db[i][1].equals(pw)){
                       return "login";
                   }else{
                       answer = "wrong pw";
                   }
               }else{
                   continue;
               }

            }
            answer = answer.equals("wrong pw")? "wrong pw" : "fail";
            return answer;
        }
    }
}
