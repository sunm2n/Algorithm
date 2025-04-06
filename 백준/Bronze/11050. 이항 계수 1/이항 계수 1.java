
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 1;

        if(n > n-k) {
            k = n - k;
        }

        for (int i = 1; i <= k; i++) {
            ans = ans * (n - i +1) / i;
        }

        System.out.println(ans);
    }
}
