class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char a;
        
        for(int i = 0; i < my_string.length(); i++){
            a = my_string.charAt(i);
            
            if(Character.isUpperCase(a)){
            // 대문자 인지 확인
                answer += Character.toLowerCase(a);
                // 소문자 변환
            } else {
                answer += Character.toUpperCase(a);
                // 대문자 변환
            }
        }
        
        return answer;
    }
}