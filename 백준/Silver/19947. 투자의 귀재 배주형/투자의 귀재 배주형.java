
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();  // 초기 자산
        int Y = sc.nextInt();  // 투자 기간

        int[] dp = new int[Y + 1];
        dp[0] = H;

        for (int i = 1; i <= Y; i++) {
            // 1년 투자
            dp[i] = Math.max(dp[i], dp[i - 1] * 105 / 100);

            // 3년 투자
            if (i >= 3) {
                dp[i] = Math.max(dp[i], dp[i - 3] * 120 / 100);
            }

            // 5년 투자
            if (i >= 5) {
                dp[i] = Math.max(dp[i], dp[i - 5] * 135 / 100);
            }
        }

        System.out.println(dp[Y]);
    }
}

