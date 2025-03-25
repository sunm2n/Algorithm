import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[30];
        int a = 0;

        for (int i = 0; i < 30; i++) {
            num[i] = 0;
        }

        for (int i = 0; i < 28; i++) {
            a = sc.nextInt();
            num[a-1] = a;
        }

        for (int i = 0; i < 30; i++) {
            if (num[i] == 0) {
                System.out.println(i+1);
            }
        }



    }
}