import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 n 입력받기
        System.out.println(fibonacci(n));
    }

    public static long fibonacci (int num){ // long으로 해야 n이 커졌을 때도 가능하다
        long []arr = new long[(int)(num+1)];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }
}