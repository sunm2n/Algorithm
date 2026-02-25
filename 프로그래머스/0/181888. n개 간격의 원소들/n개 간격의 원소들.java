class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 배열의 크기는 전체 길이를 n으로 나눈 뒤, 나머지가 있다면 1을 더해주는 방식
        int length = (num_list.length - 1) / n + 1;
        
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[n * i];
        }
        
        return answer;
    }
}