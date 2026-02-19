class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int startIndex = n - 1; 
        int[] answer = new int[num_list.length - startIndex];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[startIndex + i];
        }
        
        return answer;
    }
}