
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("Case " + (i+1) + ": " + sum);
        }
    }
}
