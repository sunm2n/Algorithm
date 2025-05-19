
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 예약할 수 있는 교시의 개수
        int X = sc.nextInt(); // 예약한 교시
        int N = sc.nextInt(); // 조원의 수
        boolean []check = new boolean[N];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // 조원이 예약할 수 있는 교시의 개수
            for (int j = 0; j < num; j++) {
                int a = sc.nextInt();
                if(a == X) {
                    check[i] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if(!check[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
