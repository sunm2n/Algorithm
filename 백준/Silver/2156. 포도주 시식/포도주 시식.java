import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        int []drink = new int[input + 1];
        int []dp = new int[input + 1];

        for(int i = 1; i <= input; i++){
            drink[i] = sc.nextInt();
            dp[i] = drink[i];
        }

        dp[1] = drink[1];
        if (input > 1) {
            dp[2] = drink[1] + drink[2];
        }

        for(int i = 3; i <= input; i++){
            dp[i] = Math.max(dp[i-1], Math.max(drink[i] + dp[i-2], drink[i] + drink[i-1] + dp[i-3]));

        }

        System.out.println(dp[input]);
    }
}
