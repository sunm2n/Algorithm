
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 표의 크기
        int M = sc.nextInt(); // 합을 구해야 하는 횟수
        int x1, x2, y1, y2;
        int [][]arr = new int[N+1][N+1];
        int [][]dp = new int[N+1][N+1]; // (1, 1)부터 (x, y)까지의 합을 저장할 배열

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = arr[i][j] + dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
            }
        }

        for (int i = 0; i < M; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            System.out.println(dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]);
        }


    }
}
