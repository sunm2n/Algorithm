
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String X = sc.next();
        int count = 0;

        while (X.length() > 1) {
            int sum = 0;
            for (char c : X.toCharArray()) {
                sum += c - '0';
            }
            X = String.valueOf(sum);
            count++;
        }

        System.out.println(count);
        if (Integer.parseInt(X) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
