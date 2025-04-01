
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int top = a * d + b * c; // 분자
        int bottom = b * d; //분모

        int r = gcd(top, bottom); // 최대 공약수

        System.out.println(top / r + " " + bottom / r);
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
