import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니의 갯수
        int M = sc.nextInt(); // 역순으로 만드는 횟수
        int a; // i번째 바구니
        int b; // j번째 바구니
        int[] basket = new int[N]; // 바구니 배열
        int[] reverse = new int[N]; // 뒤집는거 도와줄 배열

        for (int i = 0; i < N; i++) {
            basket[i] = i+1; // 배열은 0부터 숫자는 1부터 시작이므로 +1
        }

        for (int i = 0; i < M; i++) {
            a = sc.nextInt(); // i번째 바구니 입력받기
            b = sc.nextInt(); // j번째 바구니 입력받기
            for (int j = a; j <= b; j++) {
                reverse[a+b-j-1] = basket[j-1]; // 숫자는 1부터 시작 배열은 0부터 시작, 따라서 -1 해야됨
            }
            for (int j = a; j <= b; j++) {
                basket[j-1] = reverse[j-1];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}