
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a*b에서 int 범위가 넘어갈 수 있어서 long으로 선언함
        int n = sc.nextInt();
        long a;
        long b;
        long r;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            r = gcd(a, b);
            System.out.println(a*b/r); 
        }
    }

    public static long gcd(long a, long b){
        while (b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
