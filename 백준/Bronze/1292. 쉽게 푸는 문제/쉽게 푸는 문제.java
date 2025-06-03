import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int []arr = new int[1001];
        int index = 1;

        for (int i = 1; index <= 1000; i++) {
            for (int j = 0; j < i && index<= 1000; j++) {
                arr[index++] = i;
            }
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
