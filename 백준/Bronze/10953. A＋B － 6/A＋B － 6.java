
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String[] part = str.split(",");
            int a = Integer.parseInt(part[0]);
            int b = Integer.parseInt(part[1]);

            System.out.println(a + b);
        }
    }
}
