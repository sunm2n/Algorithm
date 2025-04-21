
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int [][]arr= new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int sum = 0;
            for (int j = x1-1; j < x2; j++) {
                for (int k = y1-1; k < y2; k++) {
                    sum += arr[j][k];
                }
            }

            System.out.println(sum);
        }
    }
}
