
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N개의 수
        int M = sc.nextInt(); // 합을 구해야 하는 횟수
        int []sum = new int[N + 1]; // 누적합

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            sum[i] = sum[i-1] + num;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = sum[b] - sum[a - 1];
            System.out.println(ans);
        }
    }
}
