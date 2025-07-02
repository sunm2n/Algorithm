
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열의 크기
        int []arr = new int[N+1];
        int []dp_ASC = new int[N+1]; // 증가하는 수열
        int []dp_DESC = new int[N+1]; // 감소하는 수열

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            dp_ASC[i] = 1;
            dp_DESC[i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp_ASC[i] = Math.max(dp_ASC[i], dp_ASC[j] + 1);
                }
            }
        }

        for (int i = N; i >= 1; i--) {
            for (int j = N; j > i; j--) {
                if (arr[i] > arr[j]) {
                    dp_DESC[i] = Math.max(dp_DESC[i], dp_DESC[j] + 1);
                }
            }
        }

        int max_length = 0;
        for (int i = 1; i <= N; i++) {
            max_length = Math.max(max_length, dp_ASC[i] + dp_DESC[i] - 1);
        }

        System.out.println(max_length);
    }
}
