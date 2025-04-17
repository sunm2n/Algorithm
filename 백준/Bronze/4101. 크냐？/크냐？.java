
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) {
                return;
            } else {
                if(a - b > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } while (true);
    }
}
