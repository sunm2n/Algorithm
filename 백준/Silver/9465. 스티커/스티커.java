
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {

            int n = sc.nextInt();

            int [][]arr = new int[2][n+1];
            int [][]dp = new int[2][n+1];

            // 스티커 입력
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            // 초기값 설정
            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            // 점화식 적용
            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + arr[1][j];
            }

            // 최댓값 출력
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }

        sc.close();
    }
}
