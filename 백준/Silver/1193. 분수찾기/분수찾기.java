
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int line = 1;

        while (X > line) {
            X -= line;
            line++;
        }

        int a = X;
        int b = line - X + 1;

        if (line % 2 == 0) {
            System.out.println(a + "/" + b);
        } else {
            System.out.println(b + "/" + a);
        }
    }
}
