
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int []dp_A = new int[k+1];
        int []dp_B = new int[k+1];

        dp_A[0] = 1;
        dp_B[0] = 0;

        for (int i = 1; i <= k; i++) {
            dp_A[i] = dp_B[i-1];
            dp_B[i] = dp_A[i-1] + dp_B[i-1];
        }

        System.out.println(dp_A[k] + " " + dp_B[k]);
    }
}
