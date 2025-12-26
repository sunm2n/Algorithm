class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        int []eng_before = new int[27]; // a~z는 각각 0~26과 1대1
        int []eng_after = new int[27];
        
        for(int i = 0; i < before.length(); i++) {
            eng_before[Integer.valueOf(before.charAt(i))-97]++;
            eng_after[Integer.valueOf(after.charAt(i))-97]++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(eng_before[i] != eng_after[i]) {
                answer = 0;
                break;
            }
        }
        
        return answer;
        
    }
}