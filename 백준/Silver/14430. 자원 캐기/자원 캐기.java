
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][]arr = new int[N+1][M+1];
        int [][]dp = new int[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dp[1][1] = arr[1][1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                if(arr[i][j] == 1) dp[i][j]++;
            }
        }

        System.out.println(dp[N][M]);
    }
}
