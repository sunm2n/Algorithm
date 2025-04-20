
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int []arr = new int[K];

        int pointer = 0;
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();

            if(num == 0) {
                arr[pointer] = 0;
                pointer--;
            } else {
                arr[pointer] = num;
                pointer++;
            }
        }

        int sum = 0;
        for (int i = 0; i < pointer; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
