
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char [][]chess = new char[8][8];

        for (int i = 0; i < 8; i++) {
            chess[i] = sc.nextLine().toCharArray();
        }

        int count = 0;

        for (int i = 0; i < 8; i += 2) {
            for (int j = 0; j < 8; j += 2) {
                if(chess[i][j] == 'F') {
                    count++;
                }
            }
        }

        for (int i = 1; i < 8; i += 2) {
            for (int j = 1; j < 8; j += 2) {
                if(chess[i][j] == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
