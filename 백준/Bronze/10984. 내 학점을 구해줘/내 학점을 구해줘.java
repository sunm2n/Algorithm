
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 학기 수
            int num_sum = 0;
            float grade_sum = 0;
            for (int j = 0; j < N; j++) {
                int num = sc.nextInt();
                float grade = sc.nextFloat();

                num_sum += num;
                grade_sum +=  num * grade;
            }
            System.out.printf("%d %.1f\n", num_sum, grade_sum / num_sum);
        }
    }
}
