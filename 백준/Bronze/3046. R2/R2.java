
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int avg = sc.nextInt();

        int R2 = 2 * avg - R1;

        System.out.println(R2);
    }
}
