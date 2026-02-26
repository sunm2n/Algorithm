class Solution {
    public int solution(int hp) {
        int answer = 0;
        int hp_result = hp;
        
        answer += hp_result / 5;
        hp_result %= 5;
        
        answer += hp_result / 3;
        hp_result %= 3;
        
        answer += hp_result;
        
        
        return answer;
    }
}