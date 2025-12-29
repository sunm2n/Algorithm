class Solution {
    public String solution(String my_string) {
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); // 문자를 변수에 저장하여 중복 호출 방지
            
            // 모음이 아니면 추가 
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}