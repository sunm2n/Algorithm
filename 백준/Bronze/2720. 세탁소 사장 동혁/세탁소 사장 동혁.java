import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int give;
        int[] charge = new int[num];
        int[][] charge_num = new int[num][4];


        for (int i = 0; i < num; i++) {
            give = sc.nextInt();
            charge[i] = give;
    }
        for (int i = 0; i < num; i++) {
            if(charge[i] >= 25){
                charge_num[i][0] = charge[i]/25;
                charge[i] %= 25;
            }
            if (charge[i] >= 10){
                charge_num[i][1] = charge[i]/10;
                charge[i] %= 10;
            }
            if(charge[i] >= 5){
                charge_num[i][2] = charge[i]/5;
                charge[i] %= 5;
            }
            if(charge[i] >= 1){
                charge_num[i][3] = charge[i];
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(charge_num[i][j] + " ");
            }
            System.out.println();
        }

    }
}