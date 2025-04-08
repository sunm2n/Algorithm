
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();
        long sum = 0; // sum이 int 범위를 넘어갈 수도 있음

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                sum += (long) Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
            }
        }

        System.out.println(sum);
    }
}
