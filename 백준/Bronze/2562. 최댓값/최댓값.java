import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int put;

        for (int i = 0; i < 9; i++) {
            put = sc.nextInt();
            num[i] = put;
        }

            int max = num[0];
            int max_num = 0;

        for (int i = 0; i < 9; i++) {
            if(max < num[i]){
                max = num[i];
                max_num = i;
            }
        }
        System.out.println(max);
        System.out.println(max_num + 1);
    }
}