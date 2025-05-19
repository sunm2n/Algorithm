
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 동전의 종류
        int K = sc.nextInt(); // 가치의 합

        int []coin  = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        Arrays.sort(coin);

        int count = 0;
        while (K > 0) {
            for (int i = N-1; i >= 0; i--) {
                if(K >= coin[i]) {
                    count += K / coin[i];
                    K = K % coin[i];
                }
            }
        }

        System.out.println(count);
    }
}
