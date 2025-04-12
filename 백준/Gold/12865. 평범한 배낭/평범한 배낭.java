
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 물품의 수
        int k = sc.nextInt(); // 버틸 수 있는 무게

        int []W = new int[n+1]; // 무게
        int []V = new int[n+1]; // 가중치
        for (int i = 1; i <= n; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        int [][]dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if(j < W[i]) {
                    dp[i][j] = dp[i-1][j]; // 못 담음
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - W[i]] + V[i]);
                }
            }
        }

        System.out.println(dp[n][k]);
    }
}
