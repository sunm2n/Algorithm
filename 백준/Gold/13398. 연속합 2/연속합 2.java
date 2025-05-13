import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int []dp = new int[n+1];        // 수를 제거하기 않은 경우
        int []dp_minus = new int[n+1];  // 수를 하나 제거한 경우

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }


        dp[1] = arr[1];
        dp_minus[1] = arr[1];
        int result = arr[1];

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(arr[i], arr[i] + dp[i-1]);
            dp_minus[i] = Math.max(dp[i-1], arr[i] + dp_minus[i-1]);
            result = Math.max(result, Math.max(dp[i], dp_minus[i]));
        }


        System.out.println(result);
    }
}
