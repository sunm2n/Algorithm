import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        int sum[] = new int[n];

        for (int i = 0; i < n; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sum[i] = num1 + num2;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i+1) + ": "  + sum[i]);
        }
    }
}