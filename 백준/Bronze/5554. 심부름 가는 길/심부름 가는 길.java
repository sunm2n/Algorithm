
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        int sum = input1 + input2 + input3 + input4;

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
