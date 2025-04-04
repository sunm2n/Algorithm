
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        int num = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        String str = A + B;
        int str1 = Integer.parseInt(str) - Integer.parseInt(C);

        System.out.println(num);
        System.out.println(str1);
    }
}
