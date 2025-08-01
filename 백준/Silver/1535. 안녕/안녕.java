
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int []hp = new int[N]; // 인사를 할 때 마다 잃는 체력
        int []happy = new int[N]; // 인사를 할 때마다 얻는 기쁨

        for (int i = 0; i < N; i++) {
            hp[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            happy[i] = sc.nextInt();
        }

        int[] dp = new int[101]; // 체력은 최대 100

        for (int i = 0; i < N; i++) {
            for (int j = 100; j >= hp[i]; j--) {
                if (j - hp[i] > 0) { // 체력이 hp[i] 이상이어야 인사 가능
                    dp[j] = Math.max(dp[j], dp[j - hp[i]] + happy[i]);
                }
            }
        }

        int max_happy = 0;
        for (int i = 1; i <= 100; i++) {
            max_happy = Math.max(max_happy, dp[i]);
        }

        System.out.println(max_happy);
    }
}
