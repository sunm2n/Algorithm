
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(B + C > A + D) {
            System.out.println(A + D);
        } else {
            System.out.println(B + C);
        }
    }
}
