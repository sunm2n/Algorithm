
import java.util.Scanner;

public class Main {

    static int recursiveCount = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fib(n);
        int dpcount = fibonacci(n);

        System.out.println(recursiveCount + " " + dpcount);
    }

    // 재귀 방식 f(1) 또는 f(2)가 호출될 때 마다 count++
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            recursiveCount++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // dp 방식 덧셈 횟수 = n-2
    public static int fibonacci(int n) {
        int [] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return n-2; // 덧셈 연산 횟수
    }
}
