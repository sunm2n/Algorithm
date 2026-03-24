import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] num =  new int[n][10];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            Arrays.sort(num[i]);
            sb.append(num[i][7]).append("\n"); //3번째로 큰 수
        }

        System.out.println(sb);
    }
}
