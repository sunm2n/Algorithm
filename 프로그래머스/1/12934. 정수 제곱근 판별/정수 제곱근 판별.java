class Solution {
    public long solution(long n) {
        long answer = isPerfectSquare(n);
        return answer;
    }
public long isPerfectSquare(long n) {
    
    long sqrt = (long) Math.sqrt(n); // Math.sqrt(n)은 실수(double)를 반환한다.
    boolean check = (sqrt * sqrt == n); 
    
    if(check) {
        return (sqrt + 1) * (sqrt + 1);
    } else {
        return -1;
    }
}
}