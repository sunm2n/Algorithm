
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int []arr = new int[t + 1];
        int max = 0;

        for (int i = 1; i <= t; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        long []dp = new long[max+1];

        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= max; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            sb.append(dp[arr[i]]).append("\n");
        }

        System.out.println(sb);
    }
}
