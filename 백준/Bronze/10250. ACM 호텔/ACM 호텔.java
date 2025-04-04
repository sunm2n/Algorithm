
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int H; // 호텔의 층 수
        int W; // 각 층의 방 수
        int N; // N번째 입장
        int []ans = new int[T];
        int floor;
        int room;


        for (int i = 0; i < T; i++) {
            H = sc.nextInt(); // 호텔의 층 수
            W = sc.nextInt(); // 각 층의 방 수
            N = sc.nextInt(); // N번째 입장

            floor = (N % H == 0) ? H : N % H;
            room = (N % H == 0) ? N / H : N / H + 1;

            ans[i] = floor * 100 + room;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(ans[i]);
        }
    }
}
