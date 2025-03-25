import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piece = new int[6]; // 피스의 개수를 담을 배열
        int[] need = {1, 1, 2, 2, 2, 8}; // 필요한 피스의 개수
        int piece_num; // 피스의 개수
        int[] min = new int[6];

        for (int i = 0; i < 6; i++) {
            piece_num = sc.nextInt();
            piece[i] = piece_num;
        }

        for (int i = 0; i < 6; i++) {
                min[i] = need[i] - piece[i];
            System.out.print(min[i] + " ");
            }

        }
}