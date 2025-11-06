import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []card =  new int[N+1]; // 카드의 가격
        int []dp = new int[N+1];
        dp[1] = card[1];

        for (int i = 1; i <= N; i++) {
            card[i] = sc.nextInt();
            dp[i] = card[i];
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j] + card[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
