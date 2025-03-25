import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int num = 0;
        int[][] array = new int[N][M];

        for (int i = 0; i < 2; i++) {             // 두 행렬을 더하기
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    num = sc.nextInt();
                    array[j][k] += num;
                }
            }
        }
        for (int i = 0; i < N; i++) {             // 더한 행렬을 출력
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();                 // 행 하나 끝나면 다음줄로 넘어가기
        }

    }
}