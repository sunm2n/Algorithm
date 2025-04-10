
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();  // 대각선 길이
        int W = sc.nextInt();  // 가로 비율
        int H = sc.nextInt();  // 세로 비율

        double k = D / Math.sqrt(W * W + H * H); // Math.sqrt로 제곱근 구하기

        int width = (int)(W * k);
        int height = (int)(H * k);

        System.out.println(width + " " + height);

    }
}
