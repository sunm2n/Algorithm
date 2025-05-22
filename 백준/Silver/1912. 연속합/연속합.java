
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 길이
        int []num = new int[n+1];
        int []dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
            dp[i] = num[i];
        }

        int max = dp[1];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(num[i], dp[i-1] + num[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
