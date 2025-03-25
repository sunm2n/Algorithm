import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int a;
        int b;
        int[] basket = new int[N];
        int temp = 0; // 빈공간

        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }

    }
}