
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();
        int num = L * P;
        int []arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] - num;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
