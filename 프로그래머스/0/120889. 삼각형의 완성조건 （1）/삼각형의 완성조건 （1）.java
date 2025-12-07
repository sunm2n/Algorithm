class Solution {
    public int solution(int[] sides) {
        
        int answer = 1;
        
        if(sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <= sides[1] || sides[1] + sides[2] <= sides[0]) {
            answer = 2;
        }
        
        return answer;
    }
}