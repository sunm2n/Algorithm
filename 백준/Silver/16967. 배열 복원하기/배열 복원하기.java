
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int [][]arrB = new int[H + X][W + Y]; // 배열B
        int [][]arrA = new int[H][W]; // 배열A

        // arrB 입력받기
        for (int i = 0; i < H + X; i++) {
            for (int j = 0; j < W + Y; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }

        // arrA 추출
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                arrA[i][j] = arrB[i][j];

                if(i-X >= 0 && j - Y >= 0){
                    arrA[i][j] -= arrA[i-X][j-Y];
                }
            }
        }

        // arrA 출력
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }

    }
}
