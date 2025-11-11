class Solution {
    public int[] solution(int[] num_list) {
        
        int length = num_list.length;
        
        int[] answer = new int[length + 1];
        
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[length - 1];
        int secondLast = num_list[length - 2];

        if (last > secondLast) {
            answer[length] = last - secondLast;
        } else {
            answer[length] = last * 2;
        }
        
        return answer;
    }
}