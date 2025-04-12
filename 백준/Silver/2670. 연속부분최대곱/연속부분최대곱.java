
/*
문제에서 float 가 아닌 double로 만든 이유

1. 자바에서는 Scanner.nextDouble()이 기본이다
2. Math.max()도 double용 함수가 더 일반적이기 때문이다
3. 실제로 소수 관련 문제에서 오차로 틀리는 걸 방지하려고 double 쓰는 게 습관처럼 되어 있다

chatGPT 4.0
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double []dp = new double[N+1]; // 입력 받은 수들의 연속 곱 저장
        double []num = new double[N+1]; // 입력받은 수 저장

        for (int i = 1; i <= N; i++) {
            num[i] = sc.nextDouble();
        }

        dp[1] = num[1];
        double max = dp[1];

        for (int i = 2; i <= N; i++) {
            dp[i] = Math.max(num[i], dp[i-1] * num[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.printf("%.3f\n", max); // 소수점 4째 자리에서 반올림해서 출력
    }
}
