import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();
        long num;
        long sum = 0;
        long pow = 1;
        long M = 1234567891;

        for (int i = 0; i < L; i++) {
            num = (str.charAt(i) - 96);
            sum = (sum + (num * pow % M)) % M;
            pow = (pow * 31) % M;
        }
        System.out.println(sum);
    }
}
