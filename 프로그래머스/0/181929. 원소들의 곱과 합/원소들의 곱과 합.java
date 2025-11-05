class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum =0;
        int square = 1;
        
        for(int list : num_list) {
            sum += list;
            square *= list;
        }
        
        sum = sum * sum;
        
        if(square < sum) {
            answer = 1;
        }
        
        return answer;
    }
}