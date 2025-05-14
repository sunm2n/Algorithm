
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int INF = 1_000_000; // 충분히 큰 값 (무한대 대체값)
        int N = sc.nextInt();      // 집의 수
        int[][] arr = new int[N + 1][3]; // arr[i][j] = i번 집을 j색으로 칠할 때 드는 비용

        // 0=빨강, 1=초록, 2=파랑
        for (int i = 1; i <= N; i++) {
            arr[i][0] = sc.nextInt(); // 빨강 비용
            arr[i][1] = sc.nextInt(); // 초록 비용
            arr[i][2] = sc.nextInt(); // 파랑 비용
        }

        int result = INF; // 최종 결과값 (최솟값 갱신)

        // 1번 집의 색을 0(빨강), 1(초록), 2(파랑) 각각으로 고정해 가정하고 DP를 수행
        for (int firstColor = 0; firstColor < 3; firstColor++) {
            int[][] dp = new int[N + 1][3]; // dp[i][j] = i번 집까지 칠했을 때 j색으로 끝나는 최소 비용

            // 1번 집 색 고정: 선택한 색만 비용 반영, 나머지는 INF (선택 불가능 처리)
            for (int j = 0; j < 3; j++) {
                if (j == firstColor) {
                    dp[1][j] = arr[1][j]; // 고정한 색만 사용
                } else {
                    dp[1][j] = INF;       // 나머지 색은 선택 불가
                }
            }

            // 2번 집부터 N번 집까지 DP 수행
            for (int i = 2; i <= N; i++) {
                // 현재 집을 각 색으로 칠할 때, 이전 집과 같은 색은 피하면서 최소 비용 선택
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0]; // 현재 빨강
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1]; // 현재 초록
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2]; // 현재 파랑
            }

            // 마지막 집(N번 집)의 색이 1번 집과 같은 색이면 안 됨
            for (int lastColor = 0; lastColor < 3; lastColor++) {
                if (lastColor == firstColor) continue; // 같은 색이면 skip
                result = Math.min(result, dp[N][lastColor]); // 가능한 경우 중 최소값 갱신
            }
        }
        
        System.out.println(result);
    }
}
