
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = 0;
        String []s = str.split(":");

        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);

        int r = gcd(n1, n2);

        System.out.println(n1 /r + ":" + n2/r);
    }

    public static int gcd(int a, int b){
        while( b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
