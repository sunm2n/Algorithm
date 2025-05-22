
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열의 크기
        int []num = new int[N+1];
        int []dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            num[i] = sc.nextInt();
            dp[i] = num[i];
        }

        dp[1] = num[1];
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if(num[i] > num[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + num[i]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
