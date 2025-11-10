class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        
        String str_a = Integer.toString(a) + Integer.toString(b);
        String str_b = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(str_a) >= Integer.parseInt(str_b)) {
            answer = Integer.parseInt(str_a);
        } else {
            answer = Integer.parseInt(str_b);
        }
        return answer;
    }
}