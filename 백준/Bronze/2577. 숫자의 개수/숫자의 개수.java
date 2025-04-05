
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int total = A * B * C;

        int [] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = 0;
        }

        String str = String.valueOf(total);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0'){
                num[0]++;
            } else if (str.charAt(i) == '1') {
                num[1]++;
            } else if (str.charAt(i) == '2') {
                num[2]++;
            } else if (str.charAt(i) == '3') {
                num[3]++;
            } else if (str.charAt(i) == '4') {
                num[4]++;
            } else if (str.charAt(i) == '5') {
                num[5]++;
            } else if (str.charAt(i) == '6') {
                num[6]++;
            } else if (str.charAt(i) == '7') {
                num[7]++;
            } else if (str.charAt(i) == '8') {
                num[8]++;
            } else if (str.charAt(i) == '9') {
                num[9]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }


    }
}
