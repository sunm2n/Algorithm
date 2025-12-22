class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char target = letter.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == target) {
                continue;
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}