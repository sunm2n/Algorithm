
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 종류 수
        int k = sc.nextInt(); // 목표 금액

        int []coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        // dp[i] : 금액 i를 만드는 모든 조합의 수
        // 동전을 여러 번 사용해서 금액 i를 만들 수 있는 방법의 ㄱ수
        int []dp = new int[k+1];
        dp[0] = 1; // 0원을 만드는 법은 1가지

        // dp[i - coin]은 금액(i - coin)을 만드는 조합의 수
        // 이 조합들의 각각에 coin 하나씩 붙이면 금액 i 생성
        // 기존의 dp[i]에 새로운 조합 개수만큼을 더해준다.
        for (int coin : coins) {
            for (int i = coin; i <= k; i++) {
                dp[i] += dp[i - coin];
            }
        }

        System.out.println(dp[k]);
    }
}