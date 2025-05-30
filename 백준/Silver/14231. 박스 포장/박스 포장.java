
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 박스의 개수
        int []box = new int[n+1];
        int []dp = new int[n+1];

        // 박스 크기 입력 받기
        for (int i = 1; i <= n; i++) {
            box[i] = sc.nextInt();
            dp[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (box[i] > box[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
