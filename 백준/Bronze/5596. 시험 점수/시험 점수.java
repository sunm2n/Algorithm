
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int S = 0;
        int T = 0;

        for (int i = 0; i < 4; i++) {
            int num1 = sc.nextInt();
            S += num1;
        }

        for (int i = 0; i < 4; i++) {
            int num2 = sc.nextInt();
            T += num2;
        }

        if(S >= T) {
            System.out.println(S);
        } else {
            System.out.println(T);
        }
    }
}
