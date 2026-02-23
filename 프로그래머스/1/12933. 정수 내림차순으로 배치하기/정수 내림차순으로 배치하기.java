import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        Long[] num = new Long[length]; // Collections.reverseOrder()는 객체(Object)를 대상으로 작동하므로 long[]은 기본 자료형(Primitive type) 배열이므로 Long으로 해야됨

        // 자릿수 추출 
        for (int i = 0; i < length; i++) {
            num[i] = n % 10;
            n /= 10;
        }

        // 내림차순 정렬
        Arrays.sort(num, Collections.reverseOrder());

        // 오름차순으로 붙이기
        long answer = 0;
        for (int i = 0; i < length; i++) {
            answer = answer * 10 + num[i];
        }

        return answer;
    }
}