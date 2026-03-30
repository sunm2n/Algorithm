import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 원소가 0~9 사이의 값이므로 절대 나올 수 없는 값인 -1을 초기값으로 설정
        int lastNum = -1; 
        
        for (int num : arr) {
            if (num != lastNum) {
                list.add(num);  // 이전 숫자와 다를 때만 리스트에 추가
                lastNum = num;  // 마지막 숫자를 갱신
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}