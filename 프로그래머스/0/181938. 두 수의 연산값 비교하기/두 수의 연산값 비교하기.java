class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strValue = String.valueOf(a) + String.valueOf(b);
        
        int num1 = Integer.parseInt(strValue); 
        int num2 = 2 * a * b;
        
        if(num1 < num2) {
            answer = num2; 
        } else {
            answer = num1;
        }
        
        return answer;
    }
}