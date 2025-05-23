
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt() - 1; // R번째 줄 시작
        int C = sc.nextInt() - 1; // C번째 수를 위 꼭지점으로 시작
        int W = sc.nextInt();     // 한변의 길이가 W인 삼각형

        int [][]dp = new int[R+W+1][R+W+1];

        // 파스칼 삼각형의 양 끝은 1
        for (int i = 0; i <= R+W; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        int sum = 0;
        // 삼각형 영역 합 계산
        for (int i = 0; i < W; i++) {
            for (int j = 0; j <= i; j++) {
                sum += dp[R + i][C + j];
            }
        }

        System.out.println(sum);
    }
}
