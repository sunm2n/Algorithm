import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int max = 0;
        int max_i = 0;
        int max_j = 0;
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num = sc.nextInt();
                arr[i][j] = num;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max <= arr[i][j]){
                    max = arr[i][j];
                    max_i = i + 1;
                    max_j = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(max_i + " " + max_j);

    }
}