import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];

        int In1 = 0;
        int In2 = 0;

        for (int i = 0; i < n; i++) {
            In1 = sc.nextInt();
            In2 = sc.nextInt();
            num1[i] = In1;
            num2[i] = In2;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i+1) + ": "  + num1[i] + " + " + num2[i] + " = " + (num1[i] + num2[i]) );
        }
    }
}