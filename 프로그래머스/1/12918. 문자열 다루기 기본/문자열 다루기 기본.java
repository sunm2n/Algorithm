class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        
        if(len == 4 || len == 6) { // 4또는 6일 경우만 반복문 진행
            for(int i = 0; i < len; i++) {
                if(Character.getNumericValue(s.charAt(i)) >= 0 && Character.getNumericValue(s.charAt(i)) <= 9) {
                    continue;
                }  else {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}