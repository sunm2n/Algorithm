
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 1; i <= N ; i++) {
            sum1 += i;
        }

        sum2 = sum1 * sum1;

        for (int i = 1; i <= N; i++) {
            sum3 += i*i*i;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
