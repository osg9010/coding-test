package com.cote.level1;

public class MediaPlayer {
    static class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            String answer = "";

            // 문자열을 초 단위로 변환하는 유틸리티 함수
            int videoLengthSeconds = convertToSeconds(video_len);
            int currentTimeSeconds = convertToSeconds(pos);
            int operationStartSeconds = convertToSeconds(op_start);
            int operationEndSeconds = convertToSeconds(op_end);

            // 명령어에 따라 처리
            for (String command : commands) {
                // 작업 구간에 있는지 확인
                if (currentTimeSeconds >= operationStartSeconds && currentTimeSeconds <= operationEndSeconds) {
                    currentTimeSeconds = operationEndSeconds; // 구간 안에 있으면 바로 op_end로 이동
                }
                if (command.equals("prev")) {
                    currentTimeSeconds = Math.max(0, currentTimeSeconds - 10);  // 10초 이전으로 되돌리기
                } else { // "next" 명령어
                    currentTimeSeconds = Math.min(videoLengthSeconds, currentTimeSeconds + 10); // 10초 더하기
                }

                // 작업 구간에 있는지 확인
                if (currentTimeSeconds >= operationStartSeconds && currentTimeSeconds <= operationEndSeconds) {
                    currentTimeSeconds = operationEndSeconds; // 구간 안에 있으면 바로 op_end로 이동
                }
            }

            // 최종 초를 다시 mm:ss 포맷으로 변환
            answer = convertToTimeFormat(currentTimeSeconds);
            return answer;
        }

        // "mm:ss" 형식을 초 단위로 변환
        private int convertToSeconds(String time) {
            String[] parts = time.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            return minutes * 60 + seconds;
        }

        // 초를 "mm:ss" 형식으로 변환
        private String convertToTimeFormat(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"});
        System.out.println(result); // 결과 출력
    }
}
