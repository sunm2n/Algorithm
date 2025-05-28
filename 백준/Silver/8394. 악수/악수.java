import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 회의에 참석한 사람 수
        
        // n+2로 선언한 이유는 n==1일 경우 dp[2] = 2에서 오류가 발생할 수 있기 때문이다
        int []dp = new int[n+2];

        dp[1] = 1; // 회의에 참석한 사람이 1명인 경우
        dp[2] = 2; // 회의에 참석한 사람이 2명인 경우
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10;
        }

        System.out.println(dp[n]);
    }
}
