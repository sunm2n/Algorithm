import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n >= 1
        long dp[][] = new long[n+1][10];
        final int MOD = 1_000_000_000;

        dp[1][0] = 0;
        for (int i = 1; i <=9 ; i++) {
            dp[1][i] = 1;
        }

        /**
         * 케이스를 3가지로 나눔
         * case1: 마지막 자리 수가 0이면 다음 수는 1이 와야 한다.
         * case2: 마지막 자리 수 가 9이면 다음 수는 8이 와야 한다.
         * case3: 마지막 자리가 1~8일 경우 마지막 자리+1 또는 마지막자리-1 인 수가 올 수 있다.
         */

        for (int i = 2; i <= n ; i++) {
            dp[i][0] = dp[i-1][1] % MOD; // case1
            for (int j = 1; j <=8 ; j++) {
                dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % MOD; // case 3
            }
            dp[i][9] = dp[i-1][8] % MOD; // case2
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum = (sum + dp[n][i]) % MOD;
        }
        System.out.println(sum);
    }
}
