
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int sum = a + b + c + d;

            if(sum == 0) {
                System.out.println("D");
            } else if (sum == 1) {
                System.out.println("C");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }
    }
}
