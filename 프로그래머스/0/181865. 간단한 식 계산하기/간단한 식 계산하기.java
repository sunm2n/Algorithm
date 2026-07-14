class Solution {
    public int solution(String binomial) {
        int answer = 0;
        char operator = ' ';
        int opIndex = -1; // 연산자 인덱스 위치
        
        binomial = binomial.replace(" ", "");
        
        for(int i = 0; i < binomial.length(); i++) { // 연산자 인덱스 위치 찾기
            char c = binomial.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                operator = c;
                opIndex = i;
            }
        }
        
        int num1 = Integer.parseInt(binomial.substring(0, opIndex));
        int num2 = Integer.parseInt(binomial.substring(opIndex + 1));
        
        switch(operator) {
            case '+' :
                answer = num1 + num2;
                break;
            case '-' :
                answer = num1 - num2;
                break;
            case '*' :
                answer = num1 * num2;
        }
        
        return answer;
    }
}