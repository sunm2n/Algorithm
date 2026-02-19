class Solution {
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            // 열린 괄호도 없는데 닫으려고 하면 false 반환
            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}