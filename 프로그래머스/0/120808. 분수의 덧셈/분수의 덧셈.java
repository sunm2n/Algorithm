class Solution {
    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b); 
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;
        
        int gcd = getGCD(numer, denom); 
        
        int finalNumer = numer / gcd;
        int finalDenom = denom / gcd;

        int[] answer = {finalNumer, finalDenom};
        return answer;
    }
}