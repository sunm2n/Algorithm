
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();

        long result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit;

            // 숫자일 경우
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            }
            // 알파벳일 경우
            else {
                digit = c - 'A' + 10;
            }

            result = result * num + digit; 
        }

        System.out.println(result);
    }
}