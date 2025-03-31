import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수 N 입력받기
        long []arrX = new long[N+1];
        long []arrY = new long[N+1];
        double result1 = 0;
        double result2 = 0;

        for (int i = 0; i <N; i++) {
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }

        // 신발끈 공식을 쓰기 위해서
        arrX[N] = arrX[0];
        arrY[N] = arrY[0];

        for (int i = 0; i < N; i++) {
            result1 += (arrX[i] * arrY[i+1]);
            result2 += (arrX[i+1] * arrY[i]);
        }

        double result = Math.abs(result1 - result2) / 2.0;

        String results = String.format("%.1f", result);
        System.out.println(results);
    }
}
