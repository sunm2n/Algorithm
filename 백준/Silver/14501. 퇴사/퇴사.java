import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] T = new int[N + 1];
        int[] P = new int[N + 1];
        int[] dp = new int[N + 2]; // N+1까지 고려해야 하므로 +2

        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt(); // 기간
            P[i] = sc.nextInt(); // 받을 돈
        }

        for (int i = 1; i <= N; i++) {
            // 이전까지의 최대 수익을 i일에도 반영
            dp[i] = Math.max(dp[i], dp[i - 1]);

            int nextDay = i + T[i];
            if (nextDay <= N + 1) { // N+1일이 되기 전까지
                dp[nextDay] = Math.max(dp[nextDay], dp[i] + P[i]);
            }
        }

        // 마지막 날까지의 최대 수익
        int max = 0;
        for (int i = 1; i <= N + 1; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
