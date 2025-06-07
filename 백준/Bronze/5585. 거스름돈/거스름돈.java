
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []coin = {500, 100, 50, 10, 5, 1}; // 잔돈의 종류
        int change = 1000 - sc.nextInt(); // 타로가 받을 거스름돈

        int count = 0;
        for (int i = 0; i < 6; i++) {
            count += change / coin[i];
            change %= coin[i];
        }

        System.out.println(count);
    }
}
