import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[][]arr= new boolean[1001][1001];

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = x1; j < x2 ; j++) {
                for (int k = y1; k < y2 ; k++) {
                    arr[j][k] = true;
                }
            }
        }

        int count = 0;

        for (int j = 0; j < 1001; j++) {
            for (int k = 0; k < 1001; k++) {
                if(arr[j][k]) count++;
            }
        }

        System.out.println(count);
    }
}
