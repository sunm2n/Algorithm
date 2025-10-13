class Solution {
    public String solution(String my_string) {
        int size = my_string.length();
        String answer = "";
        for (int i = 0; i < size; i++) {
            answer += my_string.charAt(size - i -1);
        }
        return answer;
    }
}