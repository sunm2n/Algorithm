
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []arr = new int[N];
        int []dp = new int[N];

        arr[0] = sc.nextInt();
        dp[0] = 0;
        System.out.print(dp[0] + " ");
        int min = arr[0];
        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextInt();
            if(min > arr[i]) {
                min = arr[i];
            }
            dp[i] = Math.max(dp[i - 1], arr[i] - min );
            System.out.print(dp[i] + " ");
        }
    }
}
