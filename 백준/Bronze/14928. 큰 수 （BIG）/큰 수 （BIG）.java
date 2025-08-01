
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MOD = 20000303;
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); // 1~1000000자리 수
        int remainder = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % MOD;
        }

        System.out.println(remainder);
    }
}