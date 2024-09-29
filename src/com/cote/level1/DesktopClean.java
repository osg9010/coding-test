package com.cote.level1;

public class DesktopClean {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = new int[4];
            int frontLineShap = 0;
            int frontShap = 0;
            int flag = 0;
            int lastLineShap = 0;
            int lastShap = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                String now = wallpaper[i];
                if(now.contains("#")){
                    frontShap = i;
                    break;
                }
            }

            for (int i = 0; i < wallpaper.length; i++) {
                String now = wallpaper[i];
                for (int j = 0; j < now.length(); j++) {
                    if((now.charAt(j) == '#' && frontLineShap > j)||(now.charAt(j) == '#' && frontLineShap==0 && flag == 0)){
                        flag = 1;
                        frontLineShap = j;
                        break;
                    }
                }
            }

            for (int i = wallpaper.length-1; i >= 0; i--) {
                String now = wallpaper[i];
                if(now.contains("#")){
                    lastShap = i+1;
                    break;
                }
            }

            for (int i = wallpaper.length-1; i >= 0; i--) {
                String now = wallpaper[i];
                for (int j = now.length()-1; j >= 0; j--) {
                    if((now.charAt(j) == '#'&& lastLineShap < j+1)||(now.charAt(j) == '#'&& lastLineShap ==0)){
                        lastLineShap = j+1;
                        break;
                    }
                }
            }

            answer[0] = frontShap;
            answer[1] = frontLineShap;
            answer[2] = lastShap;
            answer[3] = lastLineShap;

            return answer;
        }
    }
}
