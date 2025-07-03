
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int title = 666;
        int count = 0;

        while (true) {
                if(String.valueOf(title).contains("666")) {
                    count++;
                }
                if(count == N) {
                    System.out.println(title);
                    break;
                }
                title++;
        }
    }
}
