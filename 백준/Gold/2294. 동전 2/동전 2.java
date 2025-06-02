
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n개의 동전
        int k = sc.nextInt(); // 최대 가치
        int []coins = new int[n];
        int []dp = new int[k+1];

        for (int i = 1; i <= k; i++) {
            dp[i] = 100001;
        }

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for(int coin : coins) {
            for (int i = coin; i <= k; i++) {
                dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
            }
        }

        if(dp[k] == 100001){
            System.out.println("-1");
        } else {
            System.out.println(dp[k]);
        }
    }
}
