
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // 과자 1개의 가격
        int N = sc.nextInt(); // 과자의 개수
        int M = sc.nextInt(); // 현재 동수가 가진 돈
        int cost = K * N; // 동수가 필요한 금액

        int ans = cost - M;

        if(ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
