class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1000000; i >= 1; i = i/10) {
            answer += n / i;
            n = n % i;
        }
        
        return answer;
    }
}