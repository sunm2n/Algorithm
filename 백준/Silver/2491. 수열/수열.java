
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N개의 숫자

        // 입력 수가 1일 경우
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int []arr = new int[N];
        int []dp_up = new int[N]; // 증가 수열
        int []dp_down = new int[N]; // 감소 수열

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        dp_up[0] = dp_down[0] = 1;
        
        for (int i = 1; i < N; i++) {
            dp_up[i] = (arr[i - 1] <= arr[i]) ? dp_up[i - 1] + 1 : 1;
            dp_down[i] = (arr[i - 1] >= arr[i]) ? dp_down[i - 1] + 1 : 1;
        }


        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, Math.max(dp_up[i], dp_down[i]));
        }

        System.out.println(ans);
    }
}
