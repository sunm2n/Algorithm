
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        float num;

        if(str.charAt(0) == 'A') {
            num = 4.0F;
        } else if (str.charAt(0) == 'B') {
            num = 3.0F;
        } else if (str.charAt(0) == 'C') {
            num = 2.0F;
        } else if (str.charAt(0) == 'D') {
            num = 1.0F;
        } else {
            System.out.println("0.0");
            return;
        }

        if(str.charAt(1) == '+'){
            num += 0.3F;
        } else if (str.charAt(1) == '-') {
            num -= 0.3F;
        }

        System.out.println(num);
    }
}
