
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int []num = new int[T];

        int max = 0;
        for (int i = 0; i < T; i++) {
            num[i] = sc.nextInt();
            max = Math.max(max, num[i]);
        }

        int [][]dp = new int[max + 1][4];

        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;
        for (int i = 4; i <= max; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(dp[num[i]][1] + dp[num[i]][2] + dp[num[i]][3]);

        }

    }
}
