
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        int M;
        for (int i = 0; i < T; i++) {
            N = sc.nextInt(); // 서쪽 사이트
            M = sc.nextInt(); // 동쪽 사이트
            System.out.println(nCr(M, N));
        }
    }

    public static int nCr(int n, int r) {
        // Create a 2D array to store values of nCr
        int[][] pascal = new int[n + 1][r + 1];

        // Calculate Pascal's triangle values
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1; // Base case
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]; // Recursive case
                }
            }
        }

        return pascal[n][r];
    }
}