class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n > 1) {
            for(int k = 2; k <= n; k+=2) {
            answer += k;
            }
        } 
        return answer;
    }
}