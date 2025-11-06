import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            int result = A*(X-1) + B;
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
