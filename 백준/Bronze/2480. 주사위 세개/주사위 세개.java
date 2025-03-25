import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();
        int sum;

        if (a == b && b == c ) {            // a ==c 는 쓸 필요 없음 어차피 참
            sum = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            if( a == b || a == c) {
                sum = 1000 + (a * 100);
            } else {
                sum = 1000 + (b * 100);
            }
        } else {
            if( a > b && a > c) {
                sum =a * 100;
            } else if (b > a && b > c) {
                sum = b * 100;
            } else {
                sum = c * 100;
            }

        }
        System.out.println(sum);
    }
}