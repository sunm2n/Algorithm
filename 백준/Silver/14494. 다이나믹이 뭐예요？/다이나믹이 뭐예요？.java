
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }

        for (int i = 2; i <= m; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                dp[i][j] = ((dp[i-1][j-1] + dp[i-1][j]) % 1000000007 + dp[i][j-1]) % 1000000007;
            }
        }
        System.out.println(dp[n][m]);
    }
}
