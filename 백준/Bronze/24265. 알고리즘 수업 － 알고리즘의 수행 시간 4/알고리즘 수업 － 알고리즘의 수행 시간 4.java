import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < N ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("2");
    }
}
