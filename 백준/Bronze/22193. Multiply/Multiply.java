import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String strA = sc.nextLine();
        String strB = sc.nextLine();

        BigInteger bigA = new BigInteger(strA);
        BigInteger bigB = new BigInteger(strB);

        BigInteger result = bigA.multiply(bigB);

        System.out.println(result);
    }
}