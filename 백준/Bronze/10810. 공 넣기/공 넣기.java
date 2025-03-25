import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int a;
        int b;
        int c;

        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for (int j = a-1; j <= b-1; j++) {
                basket[j] = c;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}