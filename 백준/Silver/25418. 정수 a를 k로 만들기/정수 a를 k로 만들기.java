
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int K = sc.nextInt(); // 정수 A를 K로 만들어야 함
        int []dp = new int[K+1];

        for (int i = A + 1; i <= K; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0 && i / 2 >= A) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        System.out.println(dp[K]);
    }
}
