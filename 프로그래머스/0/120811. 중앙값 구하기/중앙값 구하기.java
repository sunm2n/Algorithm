import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        int size = array.length;
          
        Arrays.sort(array);
        
        int answer = array[size/2];
        return answer;
    }
}