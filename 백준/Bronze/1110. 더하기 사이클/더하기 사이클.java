
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int new_num = num;
        int N = 0;

        do {
            new_num = (new_num / 10 + (new_num % 10)) % 10 + (new_num % 10) * 10;
            N++;
        } while (new_num != num);

        System.out.println(N);
    }
}
