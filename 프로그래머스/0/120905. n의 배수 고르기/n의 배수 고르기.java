import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> numbers = new ArrayList<>(); // 길이가 가변적이므로 배열 대신 리스트 사용
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                numbers.add(numlist[i]);
            }
        }
        
        // List<Integer>를 int[]로 변환하여 return
        return numbers.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}