
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int sum = 0;
        int min = 101;

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 7; j++) {
               int num = sc.nextInt();
               if(num % 2 == 0) {
                   sum += num;
                   if(min > num) {
                       min = num;
                   }
               }
            }
            System.out.println(sum + " " + min);
            sum = 0;
            min = 101;
        }
    }
}
