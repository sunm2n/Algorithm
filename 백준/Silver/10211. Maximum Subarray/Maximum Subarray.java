
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int []dp = new int[N+1];

            // 배열에 입력값 저장하기
            int []arr = new int[N+1];
            for (int j = 1; j <= N; j++) {
                arr[j] = sc.nextInt();
                dp[j] = arr[j];
            }

            // arr[i]가 연속된 합이 마지막이 되는 것중 가장 큰 수열을 dp[i]에 저장
            for (int j = 1; j <= N; j++) {
                for (int k = 0; k < j; k++) {
                    dp[j] = Math.max(dp[j-1] + arr[j], dp[j]);
                }
            }

            int max = -1001;
            for (int j = 1; j <= N; j++) {
                max = Math.max(max, dp[j]);
            }
            System.out.println(max);
        }
    }
}
