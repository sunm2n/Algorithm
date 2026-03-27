class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        if(len % 2 != 0) { //홀수 일 때
            answer += s.charAt(len / 2);
        } else { // 짝수 일 때
            answer += s.charAt(len / 2 - 1);
            answer += s.charAt(len / 2);
        }
        
        return answer;
    }
}