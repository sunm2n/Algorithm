class Solution {
    public int solution(int[] array, int height) {
        
        int count = 0;
        for(int person : array) {
            if(person > height) {
                count++;
            }
        }
        int answer = count;
        return answer;
    }
}