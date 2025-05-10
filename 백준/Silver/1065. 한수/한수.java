
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N <= 99) {
            System.out.println(N);
        } else {
            int count = 99;
            for (int i = 100; i <= N; i++) {
                int a = (i / 100) - ((i % 100) / 10);
                int b = ((i % 100) / 10) - (i % 10);
                if(a == b) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
