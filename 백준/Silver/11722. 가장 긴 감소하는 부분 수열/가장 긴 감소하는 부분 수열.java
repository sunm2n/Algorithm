
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열의 크기
        int []num = new int[N+1]; // 입력된 수열 저장 배열
        int []dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            num[i] = sc.nextInt();
            dp[i] = 1; // 최소 길이 = 자기 하나
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if(num[i] < num[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            if(dp[i] > max) max = dp[i];
        }

        System.out.println(max);
    }
}
