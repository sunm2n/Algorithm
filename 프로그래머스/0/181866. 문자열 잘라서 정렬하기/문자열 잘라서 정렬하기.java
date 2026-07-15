import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        // 1. 빈 문자열을 제외하고 리스트에 담기
        for (String str : splitArr) {
            if (!str.isEmpty()) { 
                list.add(str);
            }
        }
        
        // 2. 리스트 오름차순 정렬
        Collections.sort(list);
        
        // 3. 리스트를 String 배열로 변환하여 반환
        return list.toArray(new String[0]);
    }
}