
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean [] arr = new boolean[N+1];

        for (int i = 2; i <= N; i++) {
            arr[i] = true;
        }

        //에라토스테니스의 체
        for (int i = 2; i * i <= N; i++) {
            if(arr[i]) {
                for (int j = i * i; j <= N ; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = M; i <= N ; i++) {
            if(arr[i]) {
                System.out.println(i);
            }
        }
    }
}
