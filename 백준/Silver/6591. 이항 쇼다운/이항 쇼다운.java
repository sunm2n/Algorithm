import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 1;
        int n =1;
        long answer = 1;

        while(true){
            n = sc.nextInt();
            k = sc.nextInt();

            if (n == 0 && k == 0){
                break;
            }

            if (k > n-k){
                k = n-k;
            }

            for (int i = 1; i <= k; i++) {
                answer = answer * (n - i + 1) / i;
            }

            System.out.println(answer);
            answer = 1;
        }
    }
}
